package org.example.PreExamen_POO;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static ArrayList<Cuenta> cuentas = new ArrayList<>();


    public static void mostrarMenu() {
        System.out.println("MENÚ PRINCIPAL:");
        System.out.println("      [1] Mantenimiento de clientes");
        System.out.println("      [2] Mantenimiento de cuentas");
        System.out.println("      [X] SALIR");
    }
    public static String opcionMenuPrincipal() {
        return teclado.next().toUpperCase();
    }
    public static void subMenu1(){
        System.out.println("CLIENTES:");
        System.out.println("      [1] Altas");
        System.out.println("      [2] Bajas");
        System.out.println("      [3] Modificaciones");
        System.out.println("      [4] Listado de clientes");
        System.out.println("      [X] Volver al menu");
        String opcionSub1 = teclado.next();
        String opcionSub1M = opcionSub1.toUpperCase();
        switch (opcionSub1M) {
            case "1":
                ejer1subMenu1();
                break;
            case "2":
                ejer2subMenu1();
                break;
            case "3":
                break;
            case "4":
                break;
            case "X":
                return;
            default:
                System.out.println("Opción no válida, intenta de nuevo.");
        }

    }
    public static void ejer1subMenu1(){
        System.out.println("Dime como quieres llamar al clliente");
        String nombre = teclado.next();

        System.out.println("Dime el apellido para " + nombre);
        String apellido = teclado.next();

        Cliente nuevocliente = new Cliente(nombre, apellido);
        clientes.add(nuevocliente);
    }
    public static void ejer2subMenu1(){
        System.out.println("Como se llama al cliente que quieres borrar???");
        String nombre = teclado.next();

        System.out.println("Dime el apellido para " + nombre);
        String apellido = teclado.next();

        Cliente borrarCliente = new Cliente(nombre, apellido);
        clientes.remove(borrarCliente);

        borrarCliente = null;

    }
    public static void ejer4subMenu1(){
        System.out.println("Listado de cliente: ");

        Cliente.getCont();
    }
    public static void main(String[] args) {

            mostrarMenu();
            String opcion = opcionMenuPrincipal();

            switch (opcion) {
                case "1":
                    subMenu1();
                    break;
                case "2":
                    break;
                case "X":
                    return;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
    }
