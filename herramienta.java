public class Herramienta extends Caracteristicas {

    private int vida;
    private int ataque;
    private int defensa;
    private elemento elemento;
    private int decay; // Según los turnos, su vida decae

    public Herramienta(int vida, int ataque, int defensa, elemento elemento, int decay) {
        super(vida, ataque, defensa, elemento);
        this.decay = decay;
    }

    // hereda los getters de vida, ataque, defensa y elemento por lo tanto
    // solo getter de decay
    public int getDecay() {
        return decay;
    }

}
