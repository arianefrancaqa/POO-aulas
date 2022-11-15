package com.aula11.exercicioAula;

public abstract class CachorroAula {
    private String nome;
    private int idade;
    private Integer numeroPatas;

    //sobrecarga
    public CachorroAula(String nome, int idade, Integer numeroPatas) {
        this.nome = nome;
        this.idade = idade;
        this.numeroPatas = numeroPatas;
    }

    public CachorroAula(String nome) {
        this.nome = nome;
    }

    public abstract void latir();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Integer getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(Integer numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
