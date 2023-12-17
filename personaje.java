enum tipo_personaje {
    
    atacante,
    defensor,
    medico
}

public class Personaje extends Caracteristicas {

    private int vida;
    private int ataque;
    private int defensa;
    private elemento elemento;
    private Herramienta herramienta;
    private tipo_personaje tipo_personaje;

    public Personaje(int vida, int ataque, int defensa, elemento elemento, Herramienta herramienta,
            tipo_personaje tipo_personaje) {
        super(vida, ataque, defensa, elemento);
        this.herramienta = herramienta;
        this.tipo_personaje = tipo_personaje;

        // agrega los bonuses de la herramienta
        this.vida = this.vida + this.herramienta.getVida();
        this.ataque = this.ataque + this.herramienta.getAtaque();
        this.defensa = this.defensa + this.herramienta.getDefensa();
    }

    // hereda getters de caracteristicas (vida, ataque, defensa, elemento), por lo
    // tanto solo getter de herramienta y tipo_personaje
    public Herramienta getHerramienta() {
        return herramienta;
    }

    public tipo_personaje getTipoPersonaje() {
        return tipo_personaje;
    }
}
