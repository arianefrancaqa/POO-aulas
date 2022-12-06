package com.aula19Continuacao;

import com.checkPoint2.Departamento;

import java.util.ArrayList;

public class Armazem {

    private ArrayList listaProdutos = new ArrayList<>();

    public Armazem() {
    }

    public void addProdutos(Produto produto){
        listaProdutos.add(produto);
    }

    public double calcularEspacoNecessario(){
        return 0;
    }
}
