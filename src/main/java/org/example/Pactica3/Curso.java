package org.example.Pactica3;

import lombok.*;

@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Curso {
    @NonNull
    private String nombre;
    private int horas;
}
