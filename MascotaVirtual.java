class Mascota {
    String nombre;
    int energia;
}

void main() {
    Mascota m = new Mascota();
    m.nombre = "Bit";
    m.energia = 80;
    IO.println(m.nombre + " tiene " + m.energia + " de energía");
}
