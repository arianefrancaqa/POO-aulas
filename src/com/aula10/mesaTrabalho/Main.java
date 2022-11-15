package com.aula10.mesaTrabalho;

public class Main {
    public static void main(String[] args) {
        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("356", "Jose", 120.00,"Pilates",true);

        AssociadoHabilitado associadoNaoHabilitado = new AssociadoHabilitado("357", "Maria", 120.00,"Pilates",false);

        System.out.println(associadoNaoHabilitado.getNome()+" deve pagar a mensalidade de: "+associadoNaoHabilitado.custoMensal());

        System.out.println(associadoHabilitado.getNome()+" deve pagar a mensalidade de: "+associadoHabilitado.custoMensal());

    }
}
