class Billetera {
    int saldo;

    void depositar(int monto) {
        saldo += monto;
    }

    void retirar(int monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            IO.println("Saldo insuficiente");
        }
    }
}

void main() {
    Billetera b = new Billetera();
    b.depositar(50000);
    b.retirar(20000);
    b.retirar(40000);
    IO.println("Saldo: $" + b.saldo);
}
