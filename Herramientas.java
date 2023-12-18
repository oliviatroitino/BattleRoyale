enum tipo_herramienta {
   mele,
   armadura,
   pocion;
}

public abstract class Herramientas extends Caracteristicas{

   private tipo_herramienta tipo_herramienta;

   public Herramientas(float durabilidad, float ataque, float defensa, Elementos elemento,
                       tipo_herramienta tipo_herramienta) {

      // La durabilidad de la herramienta es su vida
      super(durabilidad, ataque, defensa, elemento);
      this.tipo_herramienta = tipo_herramienta;

   }

   public tipo_herramienta getTipoHerramienta() {
      return tipo_herramienta;
   }

}