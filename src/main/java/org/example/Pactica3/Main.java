package org.example.Pactica3;

public class Main {
    public static void main(String[] args) {
        Instituto instituto = new Instituto("IES MUTXAMEL");

        //crear cursos
        Curso cursoJava = new Curso("Java", 100);
        Curso cursoPython = new Curso("Python", 70);
        instituto.agregarCurso(cursoJava);
        instituto.agregarCurso(cursoPython);

        //crear estudiantes
        try {
            Estudiante estudiante1 = new Estudiante("Carlos", "Alicante", cursoJava);
            Estudiante estudiante2 = new Estudiante("Ana", "Murcia", cursoPython);
            instituto.agregarEstudiante(estudiante1);
            instituto.agregarEstudiante(estudiante2);

            //intento de crear un estudiante con nombre nulo
            Estudiante estudianteErroneo = new Estudiante(null);
        } catch (NullPointerException e) {
            System.out.println("Error: No se puede crear un estudiante con nombre nulo.");
        }

        //intento de añadir un estudiante nulo en la lista de estudiantes
        instituto.agregarEstudiante(null);

        //intento de añadir un curso nulo en la lista de cursos
        instituto.agregarCurso(null);

        //mostrar cursos
        System.out.println("Cursos disponibles:");
        System.out.println(instituto.getCursos());

        //mostrar estudiantes
        System.out.println("Estudiantes registrados:");
        System.out.println(instituto.getEstudiantes());
    }
}
