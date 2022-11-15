package com.aula10.empresa;

public class FuncionarioMarketing extends Funcionario{

    private String area;

    public FuncionarioMarketing(String nome, String sobrenome, String rg, String area) {
        super(nome, sobrenome, rg);
        this.area = area;
    }

    public void trabalhar(){
        System.out.println("Funcionário Marketing "+getNome()+ " trabalhando em "+ area);
    }

    public void trabalhar(int horasExtras){
        System.out.println("Funcionário Marketing "+getNome()+ " trabalhando em "+ area+ " com "+horasExtras+" horas extras.");
    }

}
