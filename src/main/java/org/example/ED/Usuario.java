package org.example.ED;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int idUsuario;
    private ArrayList<Libro> listaLibros;

    public Usuario(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.listaLibros = new ArrayList<>(); // Inicializar la lista
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void prestarLibro(Libro libro) {
        if (libro.isDisponible()) {
            libro.prestarLibro(); // Marcar el libro como no disponible
            listaLibros.add(libro);
            System.out.println("Libro prestado a " + nombre + ": " + libro.getTitulo());
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (listaLibros.contains(libro)) {
            libro.devolverLibro(); // Marcar el libro como disponible
            listaLibros.remove(libro);
            System.out.println("Libro devuelto por " + nombre + ": " + libro.getTitulo());
        } else {
            System.out.println("El usuario " + nombre + " no tiene este libro.");
        }
    }

    public void listarLibrosPrestados() {
        if (listaLibros.isEmpty()) {
            System.out.println("El usuario " + nombre + " no tiene libros prestados.");
        } else {
            System.out.println("Libros prestados a " + nombre + ":");
            for (Libro libro : listaLibros) {
                System.out.println(libro.mostrarInformacion());
            }
        }
    }
}
