package org.example.model;

public class Libros {
    private String libroId;
    private String titulo;
    private String genero;
    private String autorId;


    public Libros() {
    }
    public Libros(String autorId, String genero, String libroId, String titulo) {
        this.autorId = autorId;
        this.genero = genero;
        this.libroId = libroId;
        this.titulo = titulo;
    }

    public String getAutorId() {
        return autorId;
    }

    public void setAutorId(String autorId) {
        this.autorId = autorId;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLibroId() {
        return libroId;
    }

    public void setLibroId(String libroId) {
        this.libroId = libroId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "autorId='" + autorId + '\'' +
                ", libroId='" + libroId + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }


}
