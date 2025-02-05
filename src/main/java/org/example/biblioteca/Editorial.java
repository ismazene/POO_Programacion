package org.example.biblioteca;

import java.util.ArrayList;

public class Editorial {

    private String nombre;
    private String pais;
    private ArrayList<Libro> librosPublicados;

    public ArrayList<Libro> getLibrosPublicados() {
        return librosPublicados;
    }

    public void setLibrosPublicados(ArrayList<Libro> librosPublicados) {
        this.librosPublicados = librosPublicados;
    }

    public void anyadirLibro(Libro libro){
        librosPublicados.add(libro);
    }

    public void borrarLibro(Libro libro){
        librosPublicados.remove(libro);
    }

    public Editorial(String nombre, String pais){
        this.nombre=nombre;
        this.pais=pais;
        this.librosPublicados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString(){
        return " Editorial :  [ nombre=" + getNombre() +  " pais=" + getPais() + " ]";
    }


}
