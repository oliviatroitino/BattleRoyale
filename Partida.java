import javax.swing.JOptionPane;

public class Partida {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla("Battle Royale");
        int cantidad_jugadores = 0;
        int cantidad_equipos = 0;
        Equipo[] equipos;
        boolean partida_finalizada = false;

        int equipo_atacante = -1; // equipos[equipo_atacante]
        int jugador_atacante = -1; // equipos[equipo_atacante][jugador_atacante]
        int equipo_atacado = -1; // equipos[equipo_atacado]
        int jugador_atacado = -1; // equipos[equipo_atacado][jugador_atacado]
        int equiposMuertos = 0;
        int GANADOR;
        boolean validoE = false;
        boolean validoP = false;

        pantalla.setVisible(true);

        JOptionPane.showMessageDialog(pantalla, "Bienvenido al Battle Royale!", "Battle Royale",
                JOptionPane.INFORMATION_MESSAGE);

        while (cantidad_jugadores < 1 || cantidad_jugadores > 4) {
            try {
                cantidad_jugadores = Integer
                        .parseInt(JOptionPane.showInputDialog(pantalla, "Cuantos personajes habrán por equipo?",
                                "Configuración Partida", JOptionPane.INFORMATION_MESSAGE));
            } catch (NumberFormatException e) {
                cantidad_jugadores = 0;
            }
            if (cantidad_jugadores < 1 || cantidad_jugadores > 4) {
                JOptionPane.showMessageDialog(pantalla, "Error", "Configuración Partida",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

        while (cantidad_equipos < 2 || cantidad_equipos > 4) {
            try {
                cantidad_equipos = Integer
                        .parseInt(JOptionPane.showInputDialog(pantalla, "Cuantos equipos habrán en la partida?",
                                "Configuración Partida", JOptionPane.INFORMATION_MESSAGE));
            } catch (NumberFormatException e) {
                cantidad_equipos = 0;
            }
            if (cantidad_equipos < 2 || cantidad_equipos > 4) {
                JOptionPane.showMessageDialog(pantalla, "Error", "Configuración Partida",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

        equipos = new Equipo[cantidad_equipos];

        for (int i = 0; i < cantidad_equipos; i++) {

            equipos[i] = new Equipo(cantidad_jugadores, pantalla, i + 1);
        }

        for (int j = 0; j < cantidad_equipos; j++) {
            equipos[j].printEquipo(equipos[j], pantalla);
        }

        while (partida_finalizada == false) {
            // comienzan siempre como falsos para entrar en los loops 1 y 2
            if (jugador_atacante + 1 == cantidad_jugadores) {
                validoE = false;
            }
            validoP = false;

            // loop 1
            // se fija si el equipo atacante es válido
            while (!validoE) {
                equipo_atacante++;
                if (equipos[equipo_atacante].getMuerto() == false) {
                    validoE = true;
                } else if (equipos[equipo_atacante].getMuerto() == true) {
                    validoE = false;
                } else if (equipo_atacante == cantidad_equipos) {
                    equipo_atacante = -1;
                    validoE = false;
                }
            }

            // loop 2
            // se fija si el jugador atacante es válido
            while (!validoP) {
                jugador_atacante++;
                if (equipos[equipo_atacante].getEquipo()[jugador_atacante].getPersonaje().getVida() > 0) {
                    validoP = true;
                } else if (equipos[equipo_atacante].getEquipo()[jugador_atacante].getPersonaje().getVida() <= 0) {
                    validoP = false;
                } else if (jugador_atacante == cantidad_jugadores) {
                    validoE = false; // el equipo ya no es válido, es el turno para atacar del siguiente equipo
                    while (!validoE) {
                        equipo_atacante++;
                        if (equipos[equipo_atacante].getMuerto() == false) {
                            validoE = true;
                        } else if (equipos[equipo_atacante].getMuerto() == true) {
                            validoE = false;
                        } else if (equipo_atacante == cantidad_equipos) {
                            equipo_atacante = -1;
                            validoE = false;
                        }
                    }
                    jugador_atacante = -1;
                    validoP = false;
                }
            }

            JOptionPane.showMessageDialog(pantalla,
                    "Turno del Equipo " + (equipo_atacante + 1) + ". Jugador "
                            + equipos[equipo_atacante].getEquipo()[jugador_atacante].getNombre()
                            + ", es tu turno!");

            // pregunta a cual equipo desea atacar
            while (equipo_atacado < 0 || (equipo_atacado + 1) > cantidad_equipos || equipo_atacado == equipo_atacante) {
                try {
                    equipo_atacado = Integer
                            .parseInt(JOptionPane.showInputDialog(pantalla,
                                    "¿A cuál equipo quieres atacar? (1-" + cantidad_equipos + ")"))
                            - 1;
                    System.out.println(equipo_atacado);
                } catch (NumberFormatException e) {
                    equipo_atacado = -1;
                }
                if (equipo_atacado < 0 || (equipo_atacado + 1) > cantidad_equipos) {
                    equipo_atacado = -1;
                    JOptionPane.showMessageDialog(pantalla, "Error.");
                } else if (equipos[equipo_atacado].getMuerto() == true) {
                    JOptionPane.showMessageDialog(pantalla, "Error. Equipo ya muerto.");
                    equipo_atacado = -1;
                } else if (equipo_atacado == equipo_atacante) {
                    JOptionPane.showMessageDialog(pantalla, ".....¿¡Estás intentando atacar a tu propio equipo!?");
                    equipo_atacado = -1;
                }
            }

            JOptionPane.showMessageDialog(pantalla,
                    "Personajes del equipo enemigo (Equipo " + (equipo_atacado + 1) + "): ");
            equipos[equipo_atacado].printEquipo(equipos[equipo_atacado], pantalla);

            while (jugador_atacado < 0 || (jugador_atacado + 1) > cantidad_jugadores) {
                try {
                    jugador_atacado = Integer
                            .parseInt(JOptionPane.showInputDialog(pantalla, "¿A quién quieres atacar?")) - 1;
                } catch (NumberFormatException e) {
                    jugador_atacado = 0;
                }
                if (jugador_atacado < 0 || (jugador_atacado + 1) > cantidad_jugadores) {
                    jugador_atacado = -1;
                    JOptionPane.showMessageDialog(pantalla, "Error.");
                } else if (equipos[equipo_atacado].getEquipo()[jugador_atacado].getPersonaje().getVida() == 0) {
                    JOptionPane.showMessageDialog(pantalla, "Error. Personaje ya muerto.");
                    jugador_atacado = -1;
                }
            }

            equipos[equipo_atacante].getEquipo()[jugador_atacante]
                    .atacar(equipos[equipo_atacado].getEquipo()[jugador_atacado], pantalla);

            // se fija si algún equipo entero está muerto
            for (int i = 0; i < cantidad_equipos; i++) {
                boolean todosMuertos = true;
                for (int j = 0; j < cantidad_jugadores; j++) {
                    if (equipos[i].getEquipo()[j].getPersonaje().getVida() > 0) {
                        todosMuertos = false;
                    }
                }

                if (todosMuertos) {
                    equipos[i].setMuerto(true);
                    equiposMuertos++;
                }
            }

            if (equipos[equipo_atacante].getMuerto() == true) {
                validoE = false; // el equipo ya no es válido, cambia al siguiente
            }

            if (equiposMuertos == cantidad_equipos - 1) {
                partida_finalizada = true;

                for (int i = 0; i < cantidad_equipos; i++) {
                    if (equipos[i].getMuerto() == false) {
                        GANADOR = i;
                    }
                }
            }
        }
    }
}
