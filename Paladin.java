public class Paladin extends Personaje {

   public Paladin() {
      // Aquí, elemento y herramienta son inicializados como nulos. Se declararán en la partida según lo eliga el jugador
      super(15, 3, 1, null, tipo_personaje.paladin, null);
   }

   // Casteo (más de 2 niveles de jerarquía)
   // Paladin deriva de Personaje, que deriva de Caracteristicas
   public void setElemento(Elementos elemento) {
      ((Caracteristicas)this).setElemento(elemento);
   }
   // Hago un super porque setHerramienta procede de Personaje
   public void setHerramienta(Herramientas herramienta) {
      super.setHerramienta(herramienta);
   }

}