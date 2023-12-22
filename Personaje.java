
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

	private Elemento elemento;

	public Personaje(float vida, float ataque, float defensa, Elemento elemento,
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
				+ "\n\tDefensa: " + getDefensa() + "\n\tElemento: " + getElemento();
	}

	public String toString() {

		return "Vida: " + getVida() + ". Ataque: " + getAtaque() + ". Defensa: " + getDefensa();

	}

	public Elemento elegirElemento() {
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

			Elemento elementoElegido = null;
			switch (selector) {
				case 1:
					JOptionPane.showMessageDialog(pantalla, "Has elegido el elemento Agua.", "Elección de elemento",
							JOptionPane.INFORMATION_MESSAGE);
					elementoElegido = Elemento.AGUA;
					break;
				case 2:
					JOptionPane.showMessageDialog(pantalla, "Has elegido el elemento Fuego.", "Elección de elemento",
							JOptionPane.INFORMATION_MESSAGE);
					elementoElegido = Elemento.FUEGO;
					break;
				case 3:
					JOptionPane.showMessageDialog(pantalla, "Has elegido el elemento Hielo.", "Elección de elemento",
							JOptionPane.INFORMATION_MESSAGE);
					elementoElegido = Elemento.HIELO;
					break;
				default:
					JOptionPane.showMessageDialog(pantalla, "Selección no válida.");
					break;
			}

			if (elementoElegido != null) {
				return elementoElegido;
			}
		} while (true);
	}

	/*
	 * public void atacar(Jugador j_enemigo, Pantalla pantalla) {
	 * Elementos elementos = new Elementos();
	 * Personaje enemigo = j_enemigo.getPersonaje();
	 * float factorAtaque = elementos.interaccion(this.getElemento(),
	 * enemigo.getElemento());
	 * 
	 * // Incluyendo la lógica de armas
	 * Herramientas arma = this.getHerramienta();
	 * if (arma != null) {
	 * if (arma.getTipoHerramienta() == tipo_herramienta.mele) {
	 * factorAtaque *= 1.2f; // Ejemplo de bonificación de ataque para armas de
	 * melee
	 * } else if (arma.getTipoHerramienta() == tipo_herramienta.armadura) {
	 * // Lógica para reducir el daño recibido por armadura, si aplica
	 * } else if (arma.getTipoHerramienta() == tipo_herramienta.pocion) {
	 * // Lógica para potenciar al personaje temporalmente con pociones
	 * }
	 * }
	 * 
	 * float damage = this.getAtaque() * factorAtaque - enemigo.getDefensa();
	 * 
	 * if (damage > 0) {
	 * enemigo.setVida(enemigo.getVida() - damage);
	 * JOptionPane.showMessageDialog(pantalla,
	 * this.getTipo_personaje() + " " + j_enemigo.getNombre() + " ha atacado a "
	 * + enemigo.getTipo_personaje() + " " + this.getNombre() + " causando " +
	 * damage
	 * + " puntos de daño.");
	 * } else {
	 * JOptionPane.showMessageDialog(pantalla,
	 * this.getTipo_personaje() + " atacó a " + enemigo.getTipo_personaje() +
	 * ", pero no causó daño.");
	 * }
	 * 
	 * }
	 */

}
