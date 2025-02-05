package org.example.Practica1;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    private static int cont = 1;
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        listaEmpleados = new ArrayList<Empleado>();
        crearEmpleados("director");
        listaInvitados = new ArrayList<Invitado>();

    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo para añadir los invitados de la lista
    public void anyadirInvitado(Invitado invitado) {
        listaInvitados.add(invitado);
    }

    //Metodo para borrar los invitados de la lista
    public void borrarInvitado(Invitado invitado) {
        listaInvitados.remove(invitado);
    }

    public void crearInvitados(String profesion, int temporada) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Como quieres que se llame el invitado");
        String nombre_invitado = teclado.next();

        Invitado invitado1 = new Invitado(nombre_invitado, profesion, temporada);
        listaInvitados.add(invitado1);
    }

    public void crearEmpleados(String cargo) {
        Scanner teclado = new Scanner(System.in);

        if (cargo.equals("director")) {
            System.out.println("Como quieres que se llame el director");
        } else {
            System.out.println("Como quieres que se llame el " + cargo);
        }

        String nombre_empleado = teclado.next();
        Empleado empleado;

        if (cargo.equals("director")) {
            empleado = new Empleado(generarId(), null, cargo, nombre_empleado);
            director = empleado;
        } else {
            empleado = new Empleado(generarId(), director, cargo, nombre_empleado);
        }
        listaEmpleados.add(empleado);
    }


    //Metodo para añadir los empleados de la lista
    public void anyadirEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    //Metodo para eliminar los invitados de la lista
    public void borrarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }

    //MODIFICAR GENERAR ID
    public String generarId() {
        return generarId + String.format("%03d", listaEmpleados);
    }



    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }

}

