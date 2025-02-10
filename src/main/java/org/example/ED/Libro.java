package org.example.ED;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible = true;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void prestarLibro() {
        if (!disponible) {
            System.out.println("El libro no está disponible.");
        } else {
            disponible = false;
            System.out.println("Libro prestado correctamente.");
        }
    }

    public void devolverLibro() {
        if (disponible) {
            System.out.println("El libro ya está disponible.");
        } else {
            disponible = true;
            System.out.println("Libro devuelto correctamente.");
        }
    }

    public String mostrarInformacion() {
        return "Libro: [Título=" + titulo + ", Autor=" + autor + ", Año=" + anioPublicacion + ", Disponible=" + disponible + "]";
    }
}
