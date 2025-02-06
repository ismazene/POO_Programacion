package org.example.Practica1;
import java.util.ArrayList;

public class Cadena {

    //Creamos los atributos
    private String nombre;
    private static ArrayList<Programa> listaProgramas;

    // Constructor
    public Cadena(String nombre) {
        this.nombre = nombre;
        listaProgramas = null;
        listaProgramas = new ArrayList<>(); // Lista de programas
    }

    // Metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    // Metodo para añadir un programa
    public void anyadirPrograma(Programa programa) {
        listaProgramas.add(programa);
    }

    // Metodo para eliminar un programa
    public void eliminaPrograma(Programa programa) {
        listaProgramas.remove(programa);
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}'; // Devuelve una cadena con la información de la cadena y sus programas
    }
}
