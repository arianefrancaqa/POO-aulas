package com.aula10.empresa;

public class FuncionarioRH extends  Funcionario{

    private int metasAlcancadas;

    public FuncionarioRH(String nome, String sobrenome, String rg) {
        super(nome, sobrenome, rg);
    }


    public void trabalhar(){
        System.out.println("Funcionário RH "+getNome()+ " trabalhando");
    }

}
