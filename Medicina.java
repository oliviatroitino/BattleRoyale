
public class Medicina extends Herramientas {

	private float bonusCuracion;
	
	public Medicina(float bonusCuracion) {
		super(1, 0, 0, null, TipoHerramienta.POCION);
		this.bonusCuracion = bonusCuracion;		
	}
	
	// Getters
	public float getBonusCuracion() {
		return bonusCuracion;
	}

	// Setters
	public void setBonusCuracion(float bonusCuracion) {
		this.bonusCuracion = bonusCuracion;
	}
	
	@Override
	public String toString() {
		return "Medicina [getBonusCuracion()=" + getBonusCuracion() + ", getTipo_herramienta()=" + getTipo_herramienta()
				+ ", getVida()=" + getVida() + ", getAtaque()=" + getAtaque() + ", getDefensa()=" + getDefensa()
				+ ", getElemento()=" + getElemento() + ", toString()=" + super.toString() + "]";
	}
	
}
