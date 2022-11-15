package com.aula10.mesaTrabalho;

public class AssociadoHabilitado extends Associado{
    private Double custoPiscina;
    private Boolean habilitado;


    public AssociadoHabilitado(String numAssociado, String nome, Double valorMensal, String atividade, Boolean habilitado) {
        super(numAssociado, nome, valorMensal, atividade);
        custoPiscina = 20.00;
        this.habilitado = habilitado;
    }

    @Override
    public Double custoMensal(){
        if (!habilitado == true){
            return getValorMensal()+custoPiscina;
        }
        return getValorMensal();
    }

    public Double getCustoPiscina() {
        return custoPiscina;
    }

    public void setCustoPiscina(Double custoPiscina) {
        this.custoPiscina = custoPiscina;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }
}
