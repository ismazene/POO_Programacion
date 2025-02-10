package org.example.PreExamen_POO;
import lombok.*;
import org.example.Practica1.Invitado;
import java.util.ArrayList;

public class Cuenta {
    private static int cont = 1;
    private String iban;
    private Cliente titular = null;
    private double saldo = 0;
    private ArrayList<Cuenta> listaCuentas;

    public Cuenta(String iban, Cliente titular, double saldo, ArrayList<Cuenta> listaCuentas) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
        this.listaCuentas = listaCuentas;
    }

    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getCont() {
        return cont;
    }
    public static void setCont(int cont) {
        Cuenta.cont = cont;
    }

    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }
    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public String generarIban() {
        return iban + String.format("%X3d", cont++);

    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", titular=" + titular +
                ", saldo=" + saldo +
                ", listaCuentas=" + listaCuentas +
                '}';
    }
}
