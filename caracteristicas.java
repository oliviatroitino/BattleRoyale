public abstract class Caracteristicas extends Elementos {
    private int vida;
    private int ataque;
    private int defensa;
    private Elementos elemento;

    // constructor que toma de elemento
    public Caracteristicas(int vida, int ataque, int defensa, elemento elemento) {
        super(elemento);
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    // getters
    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public Elementos getElemento() {
        return elemento;
    }
}

