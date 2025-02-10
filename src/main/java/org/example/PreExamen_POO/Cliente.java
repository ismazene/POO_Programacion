package org.example.PreExamen_POO;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private static int cont = 1;
    private int id;
    private String nombre;
    private String apellidos;
    private ArrayList<Cliente> listaClientes;

    public Cliente(String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.listaClientes = listaClientes;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getCont() {
        return cont;
    }
    public static void setCont(int cont) {
        Cliente.cont = cont;
    }

    public String generarId() {
        return String.valueOf(cont++);
    }
    public void preguntarNombre(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cual es su nombre??");
        String nombre = teclado.next(); // Nombre del cliente

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", listaClientes=" + listaClientes +
                '}';
    }
}
