package com.aula14.mesaTrabalho;

import java.util.ArrayList;

public class Porto {
    private boolean entradaPermitida;
    private ArrayList<Container> listaContainers = new ArrayList<>();

    public Porto(boolean entradaPermitida, ArrayList<Container> listaContainers) {

        this.entradaPermitida = entradaPermitida;
        this.listaContainers = listaContainers;
    }

    public boolean isEntradaPermitida() {
        return entradaPermitida;
    }

    public void setEntradaPermitida(boolean entradaPermitida) {
        this.entradaPermitida = entradaPermitida;
    }

    public ArrayList<Container> getListaContainers() {
        return listaContainers;
    }

    public void setListaContainers(ArrayList<Container> listaContainers) {
        this.listaContainers = listaContainers;
    }
}
