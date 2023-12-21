
public class Espada extends Herramientas {

	public Espada() {
		super(3, 2, 0, null, TipoHerramienta.MELE);
	}

	@Override
	public String toString() {
		return "Espada [Tipo_herramienta()=" + getTipo_herramienta() + ", Vida()=" + getVida() + ", Ataque()="
				+ getAtaque() + ", Defensa()=" + getDefensa() + ", Elemento()=" + getElemento() + "]";
	}

}
