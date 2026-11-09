class Lavadora {
    int numero;
    int capacidad;
    boolean ocupada;
}

void main() {
    Lavadora a = new Lavadora();
    a.numero = 1;
    a.capacidad = 8;
    a.ocupada = true;

    Lavadora b = new Lavadora();
    b.numero = 2;
    b.capacidad = 12;
    b.ocupada = false;

    IO.println("Lavadora " + a.numero + " · " + a.capacidad + " kg · ocupada: " + a.ocupada);
    IO.println("Lavadora " + b.numero + " · " + b.capacidad + " kg · ocupada: " + b.ocupada);
}
