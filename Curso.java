class Estudiante {
    String nombre;
    double nota;

    Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    boolean aprobo() {
        return nota >= 3.0;
    }
}

void main() {
    Estudiante e1 = new Estudiante("Ana", 4.2);
    Estudiante e2 = new Estudiante("Leo", 2.5);
    IO.println(e1.nombre + " aprobó: " + e1.aprobo());
    IO.println(e2.nombre + " aprobó: " + e2.aprobo());
}
