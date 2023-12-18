enum tipo_personaje {
   paladin,
   guardia,
   curandero;
}

public abstract class Personaje extends Caracteristicas {

   private tipo_personaje tipo_personaje;
   private Personaje personaje;
   private Herramientas herramienta;

   public Personaje(float vida, float ataque, float defensa, Elementos elemento, tipo_personaje tipo_personaje,
                    Herramientas herramienta) {

      super(vida, ataque, defensa, elemento);
      this.tipo_personaje = tipo_personaje;
      this.herramienta.setElemento(this.personaje.getElemento()); // El elemento del arma es automaticamente el elemento del personaje

   }

   // Getters
   // Hereda getters y setters de caracteristicas (vida, ataque, defensa, elemento)
   public tipo_personaje getTipoPersonaje() {
      return tipo_personaje;
   }

   public Herramientas getHerramienta() {
      return herramienta;
   }

   // Setters
   public void setHerramienta(Herramientas herramienta) {
      this.herramienta = herramienta;
   }
}