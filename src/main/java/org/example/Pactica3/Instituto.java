package org.example.Pactica3;
import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@Getter @Setter
public class Instituto {
    private final String NOMBRE;
    private String poblacion;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;

    public Instituto(String NOMBRE){
        if (NOMBRE == null){
            this.NOMBRE = "Instituto sin nombre";
        } else {
            this.NOMBRE=NOMBRE;
        }
        cursos = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    public void agregarCurso(Curso curso){
        if (curso == null){
            System.out.println("No se puede agregar un curso nulo");
        } else {
            cursos.add(curso);
        }
    }
    public void agregarEstudiante(Estudiante estudiante){
        if (estudiante == null){
            System.out.println("NO se puede agregar un estudiante nulo");
        } else {
            estudiantes.add(estudiante);
        }
    }
    public void eliminarCurso(Curso curso){
        getCursos().remove(curso);
    }
    public void eliminarEstudiante(Estudiante estudiante){
        getEstudiantes().remove(estudiante);
    }

}