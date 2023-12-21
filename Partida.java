import javax.swing.JOptionPane;

public class Partida {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla("Battle Royale");
        int cantidad_jugadores = 0;
        int cantidad_equipos = 0;
        Equipo[] equipos;

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

        for (int i = 0; i < cantidad_equipos; i++) {
            int atacante = i; // equipos[atacante]
            int atacado; // equipos[atacado]
            if (atacante + 1 == cantidad_equipos) {
                atacado = 0;
            } else {
                atacado = atacante + 1;
            }
            for (int j = 0; j < cantidad_jugadores; j++) {
                // mostrar los personajes del equipo atacado para que el jugador decida a cual
                // atacar
                JOptionPane.showMessageDialog(pantalla, "Personajes del equipo enemigo:");
                equipos[atacado].printEquipo(equipos[atacado], pantalla);
                // AGREGAR LÓGICA DE INTERACCIÓN/ATAQUE
                // DEBE INCLUIR LA FUNCIÓN DEL CURANDERO DE ELEGIR SI ATACA O SANA A SUS
                // COMPAÑEROS
            }
        }

    }

}
