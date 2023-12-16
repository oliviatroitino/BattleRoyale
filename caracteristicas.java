public class caracteristicas extends elementos {
    private int vida;
    private int ataque;
    private int defensa;
    private elementos elemento;

    // constructor que toma de elemento
    public caracteristicas(int vida, int ataque, int defensa, elemento elemento) {
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

    public elementos getElemento() {
        return elemento;
    }
}

