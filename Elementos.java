
// Clase que contiene los elementos y sus interacciones
enum Elemento {

	Agua,
	Fuego,
	Hielo;

}

public class Elementos {

	private Elemento elemento;

	public Elementos(Elemento elemento) {
		this.elemento = elemento;
	}

	// Getter

	public Elemento getElemento() {
		return elemento;
	}

	// Setter
	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public float interaccion(Elemento atacante, Elemento defensor) {

		float bonus = 0;
		System.out.println(atacante + " hace daño a " + defensor);
		// Lógica para aplicar el efecto y recibir daño
		return bonus;
	}

}
