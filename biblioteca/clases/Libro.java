// Archivo: src/biblioteca/Libro.java
package biblioteca.clases;
import java.time.LocalDate;

public class Libro {

    // Representa un libro físico en la biblioteca
    private String isbn;
    private String titulo;
    private String autor;
    private LocalDate anioPublicacion;
    private int ejemplaresTotales;
    private int ejemplaresDisponibles;

    public Libro(String isbn, String titulo, String autor, LocalDate anioPublicacion, int ejemplaresTotales) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresDisponibles = ejemplaresTotales;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(LocalDate anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public void setEjemplaresTotales(int ejemplaresTotales) {
        this.ejemplaresTotales = ejemplaresTotales;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public boolean estaDisponible() {
        return ejemplaresDisponibles >= 0;
    }

    public void prestarEjemplar() {
        ejemplaresDisponibles--; 
    }

    public void devolver() {
        ejemplaresDisponibles = ejemplaresDisponibles + 1;
    }

    @Override
    public String toString() {
        return String.format("ISBN: %S || Titulo: %s || Autor: %s || Año de Publicación: %d || Ejemplares Totales: %d || Ejemplares Disponibles: %d", isbn, titulo, autor, anioPublicacion, ejemplaresTotales, ejemplaresDisponibles);
    } 
}
