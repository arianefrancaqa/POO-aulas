package com.aula4;

import java.time.LocalDate;

public class Pessoa {

    //Dica atrubuto sempre é private
    private String nome;
    private Integer idade;
    private Double peso;
    private double altura;
    private String corOlho;
    private LocalDate dataNascimento;
    private char genero;
    private Boolean isTrabalhador;


    //Construtor
    //Dica: construtor e metodo sempre são públicos
    public Pessoa(){}

    public Pessoa(String nome, Integer idade, LocalDate dataNascimento, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public void respirar(){
        System.out.println("O(a) " + nome + " Está respirando" );
    }

    public Boolean piscarOlhos(){
        if (corOlho.equalsIgnoreCase("Azul")){
            System.out.println("Verdadeiro");
            return true;
        }
        System.out.println("Falso");
        return false;
    }

    public String atribuirTitulo(Boolean isCasado){
        //de for feminino (M) e casada (isCasado true) chamaremos de Senhora
        //de for feminino (M) e solteira (isCasado true) chamaremos de Senhorita

        if(this.genero == 'F' && isCasado == true){
            return "Senhora " + this.nome;
        }

        if(this.genero == 'F' && isCasado == false){
            return "Senhorita " + this.nome;
        }

        return  "Essa pessoa é um senhor";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCorOlho() {
        return corOlho;
    }

    public void setCorOlho(String corOlho) {
        this.corOlho = corOlho;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Boolean getTrabalhador() {
        return isTrabalhador;
    }

    public void setTrabalhador(Boolean trabalhador) {
        isTrabalhador = trabalhador;
    }
}
