package org.example.biblioteca;

import java.time.LocalDate;

public class Prestamo {

    //Creamos los atributos
    private Estudiante estudiante;
    private Libro libro;
    private LocalDate fecha;

    //Este es el constructor
    public Prestamo (Estudiante estudiante, Libro libro){

        this.estudiante=estudiante;
        this.libro=libro;
        fecha = LocalDate.now();
    }

    //Getter y Setter
    public LocalDate getFecha() {
        return fecha;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    //El toString para que se vea bien
    @Override
    public String toString(){
        return " Prestamo : [ estudiante=" + getEstudiante() + " libro=" + getLibro() + " fecha=" + getFecha() +" ]";
    }
}
