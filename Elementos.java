// Clase que contiene los elementos y sus interacciones
enum elemento {

   AGUA, // Daña a Fuego, recibe daño de Hielp
   HIELO, // Daña a Hielo, redibe daño de Agua
   FUEGO; // Daña a Agua, recibe daño de Fuego

}

public class Elementos {

   // Constructor que inicializa las instancias de los elementos vacío porque ya están incializados con
   // el enum superior
   public Elementos() { }

   public float interaccion(elemento atacante, elemento defensor) {

      float bonus = 0;
      System.out.println(atacante + " hace daño a " + defensor);
      // Lógica para aplicar el efecto y recibir daño
      return bonus;

   }

}