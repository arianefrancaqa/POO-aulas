package com.aula10.exercicioAula;

public class Aluno extends Pessoa{
    private Double nota;

    public Aluno(String nome, Long cpf, Double nota) {
        super(nome, cpf);
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
