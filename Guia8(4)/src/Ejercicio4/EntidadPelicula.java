
package Ejercicio4;

import java.time.LocalTime;


public class EntidadPelicula {
    private String director;
    private String titulo;
    private LocalTime duracion;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public EntidadPelicula(String director, String titulo, LocalTime duracion) {
        this.director = director;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public EntidadPelicula() {
    }

    @Override
    public String toString() {
        return "director: " + director + " titulo: " + titulo + " duracion: " + duracion + '}';
    }
    
}
