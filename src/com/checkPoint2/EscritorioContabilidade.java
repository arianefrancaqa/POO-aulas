package com.checkPoint2;

import java.util.ArrayList;

public class EscritorioContabilidade {

    private String cnpj;
    private ArrayList<Departamento> listaDepartamento = new ArrayList<>();


    public EscritorioContabilidade(String cnpj) {
        this.cnpj = cnpj;
    }

    public double calcularCustasTotal(){
        double custasTotalEcritorio = 0;
        for (Departamento departamento: listaDepartamento){
            custasTotalEcritorio += departamento.getCustas();
        }
        System.out.println("Valor total de custas é de: R$" + custasTotalEcritorio);
        return custasTotalEcritorio;
    }

    public void addDepartamentos(Departamento departamento){
        listaDepartamento.add(departamento);
    }

    public void lerDepartamento(int dias){
        for (Departamento d: listaDepartamento){
            System.out.println("O departamento: " + d.getNomeDepartamento()
                    + " possui custas de R$" + d.calcularCustas());
        }

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Departamento> getListaDepartamento() {
        return listaDepartamento;
    }

    public void setListaDepartamento(ArrayList<Departamento> listaDepartamento) {
        this.listaDepartamento = listaDepartamento;
    }
}
