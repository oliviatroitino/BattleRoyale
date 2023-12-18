public class Jugador extends Caracteristicas {

   private String nombre;
   private Personaje personaje;

   public Jugador(float vida, float ataque, float defensa, Elementos elemento, Herramientas herramientas,
                  String nombre) {

      super(vida, ataque, defensa, elemento);
      this.nombre = nombre;
   }
   // Setters
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public void setTipoPersonaje()


}
