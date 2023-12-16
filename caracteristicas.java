public class caracteristicas {
    private int vida;
    private int ataque;
    private int defensa;
    private elementos elemento;

    public caracteristicas(int vida, int ataque, int defensa, elementos elemento) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.elemento = elemento;
    }

    public int getVida() {
        return vida;
    }

    public int getDanio() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public elementos getElemento() {
        return elemento;
    }
}
