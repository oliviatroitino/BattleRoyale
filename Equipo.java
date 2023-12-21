import javax.swing.JOptionPane;

public class Equipo {
    private Jugador[] equipo;
    private int cantidad_jugadores;

    public Equipo(int cantidad_jugadores, Pantalla pantalla, int numEquipo) {
        equipo = new Jugador[cantidad_jugadores];
        this.cantidad_jugadores = cantidad_jugadores;
        String nombre;
        pantalla.setVisible(true);
        for (int i = 0; i < cantidad_jugadores; i++) {
            nombre = null;
            while (nombre == null || nombre.trim().isEmpty()) {
                nombre = JOptionPane.showInputDialog(pantalla, "Introduce tu nombre: ", "Equipo " + (numEquipo),
                        JOptionPane.INFORMATION_MESSAGE);
            }
            this.equipo[i] = new Jugador(nombre, null, numEquipo);
            Personaje personaje = this.equipo[i].elegirPersonaje();
            Elementos elemento = personaje.elegirElemento();
            personaje.setElemento(elemento);
            this.equipo[i].setPersonaje(personaje);
        }
    }

    public Jugador[] getEquipo() {
        return equipo;
    }

    public int getCantidadJugadores() {
        return cantidad_jugadores;
    }

    public void printEquipo(Equipo equipo, Pantalla pantalla) {
        pantalla.setVisible(true);
        for (int i = 0; i < equipo.getCantidadJugadores(); i++) {
            JOptionPane.showMessageDialog(pantalla,
                    (i + 1) + ". " + equipo.getEquipo()[i].getNombre()
                            + equipo.getEquipo()[i].getPersonaje().printPersonaje()
                            + "\n",
                    "Equipo " + equipo.getEquipo()[i].getNumEquipo(), JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
