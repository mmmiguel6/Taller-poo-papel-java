class Cliente {
    String nombre;
    int gigas;

    Cliente(String n, int g) {
        nombre = n;
        gigas = g;
    }

    int factura() {
        int extra = 0;
        if (gigas > 10) {
            extra = gigas - 10;
        }
        return 35000 + extra * 5000;
    }
}

void main() {
    Cliente[] lista = {
        new Cliente("Ana", 8),
        new Cliente("Leo", 15),
        new Cliente("Sara", 12)
    };
    int total = 0;
    Cliente mayor = lista[0];

    for (Cliente c : lista) {
        int fac = c.factura();
        IO.println(c.nombre + " factura " + fac);
        total += fac;
        if (fac > mayor.factura()) {
            mayor = c;
        }
    }

    IO.println(total + " · paga más: " + mayor.nombre);
}
