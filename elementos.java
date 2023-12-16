// enum para los distintos elementos
enum elemento {
    agua,
    fuego,
    hielo
}

public class elementos {
    // elemento_elegido (sirve para jugador y herramienta)
    private elemento elemento_elegido;

    // constructor
    public elementos(elemento elemento_elegido) {
        this.elemento_elegido = elemento_elegido;
    }
  
    // getter
    public elemento getElemento_elegido() {
        return elemento_elegido;
    }
}
