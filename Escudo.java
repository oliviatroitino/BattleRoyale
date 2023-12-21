
public class Escudo extends Herramientas {

	public Escudo() {
		super(3, 0, 2, null, TipoHerramienta.ARMADURA);
	}

	@Override
	public String toString() {
		return "Escudo [getTipo_herramienta()=" + getTipo_herramienta() + ", getVida()=" + getVida() + ", getAtaque()="
				+ getAtaque() + ", getDefensa()=" + getDefensa() + ", getElemento()=" + getElemento() + ", toString()="
				+ super.toString() + "]";
	}

}