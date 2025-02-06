package org.example.Practica1;

public class AppProgramas {
    public static void main (String[] args){
        // Creamos una cadena de tv
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        // Creamos un programa
        Programa el_hormiguero = new Programa("El Hormiguero",antena3);
        System.out.println(el_hormiguero);
        System.out.println(antena3);
        // Insertamos empleados en el programa
        el_hormiguero.crearEmpleados("presentador");
        System.out.println(el_hormiguero);
        // Ver empleados del programa
        System.out.println(el_hormiguero.getListaEmpleados());
        // Iinsertamos invitados en el programa
        el_hormiguero.crearInvitados("cantante",1);
        // Ver invitados del programa
        System.out.println(el_hormiguero.getListaInvitados());

    }
}