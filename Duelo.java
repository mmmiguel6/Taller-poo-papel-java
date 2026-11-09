class Jugador {
    String nombre;
    int vida = 100, ataque;

    Jugador(String nombre, int ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
    }

    void atacar(Jugador rival) {
        rival.vida -= this.ataque;
        IO.println(this.nombre + " ataca a " + rival.nombre);
    }
}

void main() {
    Jugador a = new Jugador("Zeus", 30);
    Jugador b = new Jugador("Luna", 25);
    a.atacar(b);
    b.atacar(a);
    a.atacar(b);
    IO.println("Zeus: " + a.vida);
    IO.println("Luna: " + b.vida);
}
