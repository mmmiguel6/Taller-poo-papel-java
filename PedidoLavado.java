class Pedido {
    String cliente;
    int kilos;
    boolean express;

    Pedido(String cliente, int kilos, boolean express) {
        this.cliente = cliente;
        this.kilos = kilos;
        this.express = express;
    }

    int total() {
        int t = kilos * 4500;
        if (express) {
            t += 10000;
        }
        return t;
    }
}

void main() {
    Pedido p1 = new Pedido("Ana", 5, false);
    Pedido p2 = new Pedido("Luis", 3, true);
    IO.println(p1.total());
    IO.println(p2.total());
}
