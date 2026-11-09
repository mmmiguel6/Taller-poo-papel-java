class Lavadora {
    int numero;
    boolean ocupada;

    Lavadora(int n, boolean o) {
        numero = n;
        ocupada = o;
    }
}

void main() {
    Lavadora[] sala = {
        new Lavadora(1, true),
        new Lavadora(2, true),
        new Lavadora(3, false),
        new Lavadora(4, false)
    };
    int libres = 0;
    for (Lavadora l : sala) {
        if (l.ocupada) {
            IO.println("Lavadora " + l.numero + ": ocupada");
        } else {
            IO.println("Lavadora " + l.numero + ": libre");
            libres++;
        }
    }
    IO.println("Libres: " + libres);
}
