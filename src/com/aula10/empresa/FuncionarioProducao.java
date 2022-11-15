package com.aula10.empresa;

public class FuncionarioProducao extends Funcionario{

    private String tempoExperiencia;

    public FuncionarioProducao(String nome, String sobrenome, String rg) {
        super(nome, sobrenome, rg);
    }

    public void trabalhar(){
        System.out.println("Funcionário Produção "+getNome()+ " trabalhando");
    }
}
