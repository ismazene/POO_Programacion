package org.example.casa;
import java.util.ArrayList;
import java.util.List;

class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(String nombre) {
        Habitacion habitacion = new Habitacion(nombre);
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene  " + habitaciones.size() + "Habitaciones.");
        for (Habitacion habitacion : habitaciones){
            System.out.println("- " + habitacion.getNombre() + "( " + habitacion.getMetrosCuadrados() + "m/2");
        }
    }
    public Habitacion habitacionMasGrande(){
        Habitacion aux = habitaciones.get(0);
        for (Habitacion habitacion: habitaciones){
            if (habitacion.getMetrosCuadrados()>aux.getMetrosCuadrados()){
                aux=habitacion;
            }
        }
        return aux;
    }
}