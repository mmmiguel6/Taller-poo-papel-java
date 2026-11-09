class Personaje {
    String nombre;
    int vida = 100;

    void recibirDanio(int d) {
        vida -= d;
        if (vida < 0) {
            vida = 0;
        }
    }

    void curar(int c) {
        vida += c;
        if (vida > 100) {
            vida = 100;
        }
    }

    boolean estaVivo() {
        return vida > 0;
    }
}

void main() {
    Personaje p = new Personaje();
    p.nombre = "Kira";
    p.recibirDanio(70);
    p.curar(50);
    IO.println("vida " + p.vida);
}
