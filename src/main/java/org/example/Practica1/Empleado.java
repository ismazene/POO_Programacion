package org.example.Practica1;

public class Empleado {

    //Creamos los atributos
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    // Constructor
    public Empleado(String id, Empleado director, String cargo, String nombre) {
        this.id = id;
        this.director = director;
        this.cargo = cargo;
        this.nombre = nombre;
    }

    // Metodos getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    // Metodo setter para el cargo del empleado
    public void setCargo(String cargo) {
        if (cargo.equals("director") || cargo.equals("tecnico") || cargo.equals("presentador") || cargo.equals("colaborador")) {
            this.cargo = cargo;
        } else {
            this.cargo = "pte"; // Asigna pte si el valor no es válido
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}'; // Devuelve una cadena con la información del empleado
    }
}
