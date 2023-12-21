
// TipoPersonaje es el enum.
// tipoPersonaje es la invocación
import javax.swing.*;

enum TipoPersonaje {
	Paladin,
	Guardia,
	Curandero;
}

public abstract class Personaje extends Caracteristicas {

	private TipoPersonaje tipoPersonaje;
	private Herramientas herramienta;

	public Personaje(float vida, float ataque, float defensa, Elementos elemento,
			TipoPersonaje tipoPersonaje, Herramientas herramienta) {
		super(vida, ataque, defensa, elemento);
		this.tipoPersonaje = tipoPersonaje;

		// Hacer que el elemento del arma sea automáticamente el elemento del personaje
		if (this.herramienta != null) {
			this.herramienta.setElemento(elemento);
		}
	}

	// Getters
	public TipoPersonaje getTipo_personaje() {
		return tipoPersonaje;
	}

	public Herramientas getHerramienta() {
		return herramienta;
	}

	// Setters
	public void setTipo_personaje(TipoPersonaje tipoPersonaje) {
		this.tipoPersonaje = tipoPersonaje;
	}

	public void setHerramienta(Herramientas herramienta) {
		this.herramienta = herramienta;
	}

	public String printPersonaje() {
		return "\n\nPersonaje de tipo " + getTipo_personaje() + "\n\tVida: " + getVida()
				+ "\n\tAtaque: " + getAtaque()
				+ "\n\tDefensa: " + getDefensa() + "\n\tElemento: " + getElemento().getElemento();
	}

	public String toString() {

		return "Vida: " + getVida() + ". Ataque: " + getAtaque() + ". Defensa: " + getDefensa();

	}

	public Elementos elegirElemento() {

		Pantalla pantalla = new Pantalla("Elegir Elemento");
		int selector = 0;

		do {
			while (selector < 1 || selector > 3) {
				try {
					selector = Integer.parseInt(JOptionPane.showInputDialog(pantalla,
							"Tu personaje debe de ser de un elemento concreto.\n\n\t1 - Agua\n\t2 - Fuego\n\t3 - Hielo\n\nAgua daña Fuego, Fuego daña Hielo, Hielo daña Agua. \nElige sabiamente: ",
							"Elección de elemento", JOptionPane.INFORMATION_MESSAGE));
				} catch (NumberFormatException e) {
					selector = 0;
				}
			}

			if (selector == 1) {
				JOptionPane.showMessageDialog(pantalla, "Has elegido el elemento Agua.", "Elección de elemento",
						JOptionPane.INFORMATION_MESSAGE);
				Elementos elementoAgua = new Elementos(Elemento.Agua);
				return elementoAgua;
			} else if (selector == 2) {
				JOptionPane.showMessageDialog(pantalla, "Has elegido  el elemento Fuego.", "Elección de elemento",
						JOptionPane.INFORMATION_MESSAGE);
				Elementos elementoFuego = new Elementos(Elemento.Fuego);
				return elementoFuego;
			} else if (selector == 3) {
				JOptionPane.showMessageDialog(pantalla, "Has elegido  el elemento Hielo.", "Elección de elemento",
						JOptionPane.INFORMATION_MESSAGE);
				Elementos elementoHielo = new Elementos(Elemento.Hielo);
				return elementoHielo;
			} else {
				JOptionPane.showMessageDialog(pantalla, "Selección no válida.");
			}
		} while (true);
	}

}
