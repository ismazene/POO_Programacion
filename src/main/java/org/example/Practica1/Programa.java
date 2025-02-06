package org.example.Practica1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    private static int cont = 1; // Contador estatico para generar los ID
    private String nombre; // Nombre del programa
    private Cadena cadena; // Cadena de televisión
    private int temporadas; // Número de temporadas del programa
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director; // El director del programa

    // Constructor
    public Programa(String nombre, Cadena cadena) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0; // Se empieza con 0 temporadas
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();

        crearEmpleados("director"); // Creamos el director
        listaEmpleados.add(director); // Añade el director a la lista de empleados
    }

    // Metodos getter y setter
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

    // Metodo para añadir un invitado a la lista
    public void anyadirInvitado(Invitado invitado) {
        listaInvitados.add(invitado);
    }

    // Metodo para borrar un invitado de la lista
    public void borrarInvitado(Invitado invitado) {
        listaInvitados.remove(invitado);
    }

    // Metodo para crear un invitado y añadirlo a la lista
    public void crearInvitados(String profesion, int temporada) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre del invitado:");
        String nombre_invitado = teclado.next();

        System.out.println("Introduce el año en el que acude el invitado " + nombre_invitado);
        int anio = teclado.nextInt();

        System.out.println("Introduce el mes:");
        int mes = teclado.nextInt();

        System.out.println("Introduce el día:");
        int dia = teclado.nextInt();

        // Crea la fecha con la info proporcionado por el usuario
        LocalDate fechaVisita = LocalDate.of(anio, mes, dia);

        // Crea un nuevo invitado y lo agrega a la lista
        Invitado invitado1 = new Invitado(nombre_invitado, profesion, temporada, fechaVisita);
        listaInvitados.add(invitado1);
    }

    // Metodo para crear empleados
    public void crearEmpleados(String cargo) {
        Scanner teclado = new Scanner(System.in);

        if (cargo.equals("director")) {
            System.out.println("Como quieres que se llame el director");
        } else {
            System.out.println("Como quieres que se llame el " + cargo);
        }

        String nombre_empleado = teclado.next(); // Nombre del empleado
        Empleado empleado;

        // Se crea como director
        if (cargo.equals("director")) {
            empleado = new Empleado(generarId(), null, cargo, nombre_empleado);
            director = empleado; // Director del programa
        } else {
            empleado = new Empleado(generarId(), director, cargo, nombre_empleado);
        }
        listaEmpleados.add(empleado); // Añade el empleado a la lista
    }

    // Metodo para añadir un empleado a la lista
    public void anyadirEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    // Metodo para eliminar un empleado de la lista
    public void borrarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }

    // Metodo para listar los invitados de una temporada específica
    public void invitadosTemporada(int temporada) {
        int cont = 0;
        System.out.println("Invitados en la temporada " + temporada);

        for (int i = 0; i < listaInvitados.size(); i++) {
            Invitado invitado = listaInvitados.get(i);
            if (invitado.getTemporada() == temporada) {
                System.out.println(invitado.getNombre() + " - " + invitado.getProfesion());
                cont++;
            }
        }

        if (cont == 0) {
            System.out.println("No habian invitados en esa temporada.");
        } else {
            System.out.println("Total invitados: " + cont);
        }
    }

    // Metodo que cuenta cuantas veces un invitado ha participado en el programa
    public int vecesInvitado(String nombre) {
        int contador = 0;

        // Recorre la lista de invitados y cuenta las veces que aparece el nombre
        for (int i = 0; i < listaInvitados.size(); i++) {
            Invitado invitado = listaInvitados.get(i);
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                contador++;
            }
        }

        return contador; //Devuelve el numero de veces que el invitado ha participado en un programa
    }

    // Metodo para rastrear a un invitado
    public void rastrearInvitado(String nombre) {
        System.out.println("Rastrear invitado " + nombre);

        // Recorre la lista de invitados y muestra las fechas y temporadas en los que participa
        for (int i = 0; i < listaInvitados.size(); i++) {
            Invitado invitado = listaInvitados.get(i);
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Fecha: " + invitado.getFechaVisita() + " | Temporada: " + invitado.getTemporada());
            }
        }
    }

    // Metodo para verificar si un invitado existe en la lista
    public boolean buscarInvitado(String nombre) {
        for (int i = 0; i < listaInvitados.size(); i++) {
            Invitado invitado = listaInvitados.get(i);
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                return true; // Si esta devuelve verdadero
            }
        }
        return false; // Si no devuelve falso
    }

    // Metodo para generar un ID
    public String generarId() {
        return "EP" + String.format("%03d", cont++); // Genera un ID con formato "EP001", "EP002", etc.
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
                '}'; // Devuelve una representación en forma de cadena del objeto
    }

}
