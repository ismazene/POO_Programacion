package org.example.casa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;
    private Propietario propietario;

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Scanner teclado) { // Recibe Scanner como argumento
        System.out.print("Introduce el propietario: ");
        String nombre = teclado.next();
        System.out.print("Edad del propietario: ");
        int edad = teclado.nextInt();
        this.propietario = new Propietario(nombre, edad);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Casa(String direccion) { // Scanner se pasa en el constructor
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();

    }

    public void agregarHabitacion(String nombre, int metros) {
        // Verificar si la habitación ya existe antes de agregarla
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNombre().equals(nombre)) {
                System.out.println("La habitación ya existe");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre, metros);
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene " + habitaciones.size() + " habitaciones.");
        System.out.println("Propietario: " + propietario.getNombre() + " (" + propietario.getEdad() + " años)");
        for (Habitacion habitacion : habitaciones) {
            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetrosCuadrados() + " m²)");
        }
    }

    public Habitacion habitacionMasGrande() {
        if (habitaciones.isEmpty()) {
            return null; // Manejo de posible lista vacía
        }

        Habitacion aux = habitaciones.get(0);
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getMetrosCuadrados() > aux.getMetrosCuadrados()) {
                aux = habitacion;
            }
        }
        return aux;
    }

    public void eliminarHabitacion(String nombre) {
        habitaciones.removeIf(habitacion -> habitacion.getNombre().equals(nombre));
    }
}
