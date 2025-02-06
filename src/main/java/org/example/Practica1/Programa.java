package org.example.Practica1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    //Creamos los atributos
    private static int cont = 1; // Contador estatico para generar los ID
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

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

    // Metodo para crear un invitado y añadirlo a la lista, hacemos tambien la verificaion de las fechas para qu no sea menor de 2025, y que los meses esten entre el 1 y el 12
    // y por ultimo los dias son entre 1 y 31
    public void crearInvitados(String profesion, int temporada) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre del invitado:");
        String nombre_invitado = teclado.next();

        int anio = 0;
        boolean anioValido = false;
        while (!anioValido) {
            System.out.println("Introduce el año en el que acude el invitado " + nombre_invitado);
            try {
                anio = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Introduce un valor valido");
                teclado.next();
                continue;
            }

            if (anio >= 2025) {
                anioValido = true;
            } else {
                System.out.println("El año debe ser mayor o igual a 2025");
            }
        }

        int mes = 0;
        boolean mesValido = false;
        while (!mesValido) {
            System.out.println("Introduce el mes:");
            try {
                mes = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Introduce un valor valido");
                teclado.next();
                continue;
            }

            if (mes >= 1 && mes <= 12) {
                mesValido = true;
            } else {
                System.out.println("El mes debe estar entre 1 y 12");
            }
        }

        int dia = 0;
        boolean diaValido = false;
        while (!diaValido) {
            System.out.println("Introduce el dia:");
            try {
                dia = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Introduce un valor valido");
                teclado.next();
                continue;
            }

            if (dia >= 1 && dia <= 31) {
                diaValido = true;
            } else {
                System.out.println("El dia debe estar entre 1 y 31");
            }
        }

        // Crea la fecha
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

    // Metodo para listar los invitados de una temporada especifica
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
        return "EP" + String.format("%03d", cont++); // Genera un ID con formato EP001...
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
