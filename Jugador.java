import javax.swing.JOptionPane;

public class Jugador {

	private String nombre;
	private Personaje personaje;
	private int numEquipo;

	public Jugador(String nombre, Personaje personaje, int numEquipo) {

		this.nombre = nombre;
		this.personaje = personaje;
		this.numEquipo = numEquipo;

	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public int getNumEquipo() {
		return numEquipo;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public void printJugador() {

	}

	public Personaje elegirPersonaje() {

		Paladin paladin = new Paladin();
		Guardia guardia = new Guardia();
		Curandero curandero = new Curandero();

		Pantalla pantalla = new Pantalla("Elegir Personaje");
		int selector = 0;

		// Scanner sc = new Scanner(System.in);

		do {
			while (selector < 1 || selector > 3) {
				try {
					selector = Integer.parseInt(JOptionPane.showInputDialog(pantalla,
							"¡Bienvenido a configuración de personaje! Tu personaje debe de ser de una clase concreta. Elígela: \n\n1 - Paladin. El paladín posee un ataque excepcional, pero a costa de tener una vida más reducida.\n"
									+ paladin.toString()
									+ "\n2 - Guardia. La resistencia y armadura adicional del guardia lo hace temible, pero escasea en fuerza.\n"
									+ guardia.toString()
									+ "\n3 - Curandero. No destaca en nada, pero posee la habilidad única de curar un determinado número de puntos de vida a ti o a los miembros de tu numEquipo.\n"
									+ curandero.toString()
									+ "\n\nElige tu personaje (número): ",
							"Elección de personaje", JOptionPane.INFORMATION_MESSAGE));
				} catch (NumberFormatException e) {
					selector = 0;
				}
			}

			switch (selector) {
				case 1:
					JOptionPane.showMessageDialog(pantalla, "Has elegido la clase paladín.", "Elección de personaje",
							JOptionPane.INFORMATION_MESSAGE);
					return paladin;

				case 2:
					JOptionPane.showMessageDialog(pantalla, "Has elegido la clase guardia.", "Elección de personaje",
							JOptionPane.INFORMATION_MESSAGE);
					return guardia;

				case 3:
					JOptionPane.showMessageDialog(pantalla, "Has elegido la clase curandero.", "Elección de personaje",
							JOptionPane.INFORMATION_MESSAGE);
					return curandero;

				default:
					JOptionPane.showMessageDialog(pantalla, "Selección no válida");
			}

		} while (true); // Este bucle se repetirá hasta que el usuario haga una seleccion valida

		// sc.close(); // No es necesario cerrar System.in

	}

}
