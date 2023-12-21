
// TipoHerramienta es el enum.
// tipoHerramienta es la invocación

enum TipoHerramienta {
	MELE,
	ARMADURA,
	POCION;
}

public abstract class Herramientas extends Caracteristicas {

	private TipoHerramienta tipoHerramienta;
	
	public Herramientas(float durabilidad, float ataque, float defensa, Elementos elemento, 
			TipoHerramienta tipoHerramienta) {
		super(durabilidad, ataque, defensa, elemento);
		this.tipoHerramienta = tipoHerramienta;
	}

	// Getters
	public TipoHerramienta getTipo_herramienta() {
		return tipoHerramienta;
	}

	// Setters
	public void setTipo_herramienta(TipoHerramienta tipoHerramienta) {
		this.tipoHerramienta = tipoHerramienta;
	}
	

}
