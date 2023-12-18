public class Curandero extends Personaje {

   public Curandero() {
      super(15, 2, 2, null, tipo_personaje.curandero, null);
   }

   public void setElemento(Elementos elemento) {
      ((Caracteristicas)this).setElemento(elemento);
   }

   public void setHerramienta(Herramientas herramienta) {
      super.setHerramienta(herramienta);
   }
   
}
