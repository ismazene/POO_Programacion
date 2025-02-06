package org.example.pruebas_lombok;

import lombok.*;

@NoArgsConstructor
@Data
public class Instituto {

    @NonNull
    private String nombre;
    private String poblacion;

    public Instituto(String nombre){
//        if (nombre==null){
//            System.out.println("El nombre no puede ser nulo");
//        } else {
//            this.nombre = nombre;
//        }
    }
}
