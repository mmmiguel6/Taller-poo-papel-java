class Producto {
    String nombre;
    int precio;

    void mostrar() {
        IO.println(nombre + ": $" + precio);
    }
}

void main() {
    Producto p = new Producto();
    p.nombre = "Audífonos";
    p.precio = 45000;
    p.mostrar();

    Producto otro = new Producto();
    otro.nombre = "Cargador";
    otro.precio = 25000;
    otro.mostrar();
}
