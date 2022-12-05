package com.checkPoint2;

import java.util.ArrayList;

public class EscritorioContabilidade {

    private Long cnpj;
    private ArrayList<Departamento> listaDepartamento = new ArrayList<>();


    public EscritorioContabilidade(Long cnpj) throws Exception {
        if(cnpj.toString().length() > 14){
            throw new Exception("O CNPJ tem mais de 14 dígitos");
        }else if(cnpj.toString().length() < 14 ){
            throw new Exception("O CNPJ tem menos de 14 dígitos");
        }
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

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Departamento> getListaDepartamento() {
        return listaDepartamento;
    }

    public void setListaDepartamento(ArrayList<Departamento> listaDepartamento) {
        this.listaDepartamento = listaDepartamento;
    }
}
