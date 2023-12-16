public class personaje extends caracteristicas {
    private int vida;
    private int ataque;
    private int defensa;
    private elemento elemento;
    private herramienta herramienta;

    public personaje(int vida, int ataque, int defensa, elemento elemento, herramienta herramienta) {
        super(vida, ataque, defensa, elemento);
        this.herramienta = herramienta;

        // agrega los bonuses de la herramienta
        this.vida = this.vida + this.herramienta.getVida();
        this.ataque = this.ataque + this.herramienta.getAtaque();
        this.defensa = this.defensa + this.herramienta.getDefensa();
    }

    // hereda getters de caracteristicas (vida, ataque, defensa, elemento), por lo
    // tanto solo getter de herramienta
    public herramienta getHerramienta() {
        return herramienta;
    }
}
