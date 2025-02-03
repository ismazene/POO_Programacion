package org.example.casa;

class Habitacion {
    private String nombre;
    private double metrosCuadrados;

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + metrosCuadrados + " m²)";
    }
}
