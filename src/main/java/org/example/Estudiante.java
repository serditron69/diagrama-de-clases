package org.example;

public class Estudiante extends Persona {
    private String codigo;
    private Curso curso;

    public Estudiante() {}

    public Estudiante(String nombres, int edad, String genero, String codigo) {
        super(nombres, edad, genero);
        this.codigo = codigo;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombres=" + getNombres() +
                ", codigo='" + codigo + '\'' +
                ", curso=" + curso +
                '}';
    }
}
