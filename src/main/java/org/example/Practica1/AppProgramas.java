package org.example.Practica1;

import java.util.Scanner;

public class AppProgramas {
    public static void main(String[] args) {
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println("Cadena de TV: " + antena3);

        Programa el_hormiguero = new Programa("El Hormiguero", antena3);
        System.out.println(el_hormiguero);

        el_hormiguero.crearEmpleados("presentador");
        System.out.println(el_hormiguero);

        System.out.println("Lista de empleados del programa:");
        System.out.println(el_hormiguero.getListaEmpleados());

        el_hormiguero.crearInvitados("cantante", 1);

        System.out.println("Lista de invitados del programa:");
        System.out.println(el_hormiguero.getListaInvitados());

        System.out.println("Invitados de la temporada 1:");
        el_hormiguero.invitadosTemporada(1);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del invitado para buscar cuántas veces ha participado:");
        String nombreInvitado = teclado.nextLine();
        int veces = el_hormiguero.vecesInvitado(nombreInvitado);
        System.out.println("El invitado " + nombreInvitado + " ha participado " + veces + " veces.");

        System.out.println("Introduce el nombre del invitado para rastrear su participación:");
        String rastreoNombre = teclado.nextLine();
        el_hormiguero.rastrearInvitado(rastreoNombre);

        System.out.println("Introduce el nombre del invitado para ver si existe en la lista:");
        String verificarNombre = teclado.nextLine();
        boolean existe = el_hormiguero.buscarInvitado(verificarNombre);
        if (existe) {
            System.out.println("El invitado " + verificarNombre + " existe en la lista.");
        } else {
            System.out.println("El invitado " + verificarNombre + " no existe en la lista.");
        }
    }
}
