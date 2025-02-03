package org.example.Practica1;

import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

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

    public Programa(String nombre,Cadena cadena, int temporadas, Empleado director){
        this.nombre=nombre;
        this.cadena=cadena;
        this.temporadas=temporadas;
        listaEmpleados = new ArrayList<Empleado>();
        listaInvitados = new ArrayList<Invitado>();
        this.director=director;
    }

    //Metodo para añadir los invitados de la lista
    public void anyadirInvitado(Invitado invitado){
        listaInvitados.add(invitado);
    }
    //Metodo para borrar los invitados de la lista
    public void borrarInvitado(Invitado invitado){
        listaInvitados.remove(invitado);
    }

    //Metodo para añadir los empleados de la lista
    public void anyadirEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }
    //Metodo para eliminar los invitados de la lista
    public void borrarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }

}
