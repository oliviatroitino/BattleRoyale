// Una clase abstracta puede heredar de una sola clase (abstracta o no) mientras que una 
// interfaz puede extender varias interfaces de una misma vez. Una clase abstracta puede tener métodos 
// que sean abstractos o que no lo sean, mientras que las interfaces sólo y exclusivamente 
// pueden definir métodos abstractos.

public class Caracteristicas {

   private float vida;
   private float ataque;
   private float defensa;
   private Elementos elemento;

   // Constructor que toma un elemento
   public Caracteristicas(float vida, float ataque, float defensa, Elementos elemento) {
      this.vida = vida;
      this.ataque = ataque;
      this.defensa = defensa;
      this.elemento = elemento;
   }

   // Getters
   public float getVida() {
      return vida;
   }

   public float getAtaque() {
      return ataque;
   }

   public float getDefensa() {
      return defensa;
   }

   public Elementos getElemento() {
      return elemento;
   }

   // Setters
   public void setVida(float vida) {
      this.vida = vida;
   }

   public void setAtaque(float ataque) {
      this.ataque = ataque;
   }

   public void setDefensa(float defensa) {
      this.defensa = defensa;
   }

   public void setElemento(Elementos elemento) {
      this.elemento = elemento;
   }

}

// En este diseño, Caracteristicas no extiende directamente de Elementos. 
// Aquí toma un objeto Elemento como parámetro en su constructor y proporciona métodos
// para interactuar con el elemento asociado.

// El uso de composición de esta manera es una alternativa a la herencia y puede ser más flexible, 
// ya que permite a Caracteristicas trabajar con cualquier objeto que implemente Elemento, 
// en lugar de estar limitado a una relación de herencia específica. Esto facilita la reutilización y extensión del código en el futuro.