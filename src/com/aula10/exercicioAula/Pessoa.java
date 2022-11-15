package com.aula10.exercicioAula;

import java.time.LocalDate;

public class Pessoa {
    protected String nome;
    private Long cpf;

    public Pessoa(String nome, Long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void calcularImc(int valorImc){
        System.out.println(this.nome+" seu IMC é de: "+ valorImc);
    }

    public int calcularIdade(LocalDate dataNascimento){
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
