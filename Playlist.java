class Cancion {
    String titulo, artista;
    int segundos;

    Cancion(String t, String a, int s) {
        titulo = t;
        artista = a;
        segundos = s;
    }

    public String toString() {
        int min = segundos / 60;
        int seg = segundos % 60;
        return titulo + " - " + artista + " (" + min + ":" + seg + ")";
    }
}

void main() {
    Cancion c = new Cancion("Ruta", "Los Pixel", 215);
    IO.println(c);
    Cancion c2 = new Cancion("Sol", "Mía", 190);
    IO.println(c2);
}
