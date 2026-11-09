class Linea {
    private int saldo;

    int getSaldo() {
        return saldo;
    }

    void recargar(int valor) {
        if (valor >= 1000) {
            saldo += valor;
        } else {
            IO.println("Recarga mínima: $1000");
        }
    }
}

void main() {
    Linea l = new Linea();
    l.recargar(5000);
    l.recargar(500);
    IO.println("Saldo: $" + l.getSaldo());
}
