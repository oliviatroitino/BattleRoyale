public class Guardia extends Personaje {

   public Guardia() {
      super(20, 1, 3, null, tipo_personaje.guardia, null);
   }

   public void setElemento(Elementos elemento) {
      ((Caracteristicas)this).setElemento(elemento);
   }

   public void setHerramienta(Herramientas herramienta) {
      super.setHerramienta(herramienta);
   }
   
}
