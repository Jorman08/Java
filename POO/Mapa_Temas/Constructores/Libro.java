package POO.Mapa_Temas.Constructores;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo) {
        this.titulo = titulo; 
        this.autor = "Desconocido";
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }
}
