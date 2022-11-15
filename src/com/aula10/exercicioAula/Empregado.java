package com.aula10.exercicioAula;

public class Empregado extends  Pessoa{

    private Double salario;
    private Double descontos;
    private String arquivo;

    public Empregado(String nome, Long cpf, Double salario, Double descontos) {
        super(nome, cpf);
        this.salario = salario;
        this.descontos = descontos;
    }

    //sobrescrito modificando o código
    @Override
    public void calcularImc(int valorImc){
        System.out.println(nome + " CPF: "+ getCpf()+" seu IMC é de: "+ valorImc+ " Preste atenção nos valores consultando a tabela do Google");
    }

    //sobrecarga
    public Double calcularSalario(Double valorHora){
        return 220*valorHora;
    }

    //sobrecarga
    public Double calcularSalario(Double valorHora, Double quantidadeHoras){
        return valorHora*quantidadeHoras;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getDescontos() {
        return descontos;
    }

    public void setDescontos(Double descontos) {
        this.descontos = descontos;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}
