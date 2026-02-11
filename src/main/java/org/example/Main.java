package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante();
        e1.setNombres("Juan");
        e1.setEdad(20);
        e1.setGenero("M");
        e1.setCodigo("2024001");

        Estudiante e2 = new Estudiante("Ana", 22, "femenina", "2024002");

        Curso c1 = new Curso("Ingeniería de software");
        e1.setCurso(c1);

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Matemáticas"));
        cursos.add(new Curso("Programación"));

        // === MOSTRAR ===
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(c1.toString());
        System.out.println("Cursos de la universidad: " + cursos);
    }
}