package org.example.Pactica3;
import lombok.*;

@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Estudiante {
    @NonNull
    private String nombre;
    private String poblacion;
    private Curso curso;
}
