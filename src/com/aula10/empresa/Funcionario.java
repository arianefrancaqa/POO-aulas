package com.aula10.empresa;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private String rg;

    public Funcionario(String nome, String sobrenome, String rg) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
    }

    public void trabalhar(){
        System.out.println("Funcionário "+nome+" trabalhando");
    }

    public void descansar(){
        System.out.println("Funcionário "+nome+" descansando");
    }

    @Override
    public String toString(){
        return sobrenome + ", "+ nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
