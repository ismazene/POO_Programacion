package org.example.casa;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio", 50);
        casa.agregarHabitacion("Cocina", 40);
        casa.agregarHabitacion("Baño", 25);

        casa.mostrarHabitaciones();
        System.out.println("La habitacion mas grande de la casa es:_/////");
    }
}
