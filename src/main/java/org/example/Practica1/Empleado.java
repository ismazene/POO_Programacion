package org.example.Practica1;

public class Empleado {
    //Contador en estatico para que siempre se instancie un numero mas cada vez que se llama al metodo
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String id, Empleado director, String cargo, String nombre) {
        this.id = id;
        this.director = director;
        this.cargo = cargo;
        this.nombre = nombre;
    }

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
    public void setCargo(String cargo) {
        this.cargo = cargo;
        if (cargo.equals("director") || cargo.equals("tecnico") || cargo.equals("presentador") || cargo.equals("colaborador")){
            this.cargo=cargo;
        } else {
            this.cargo="pte";
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
                '}';
    }
}
