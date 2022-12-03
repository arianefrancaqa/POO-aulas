package com.aula15;

import java.util.ArrayList;
import java.util.Collections;

public class Teste {

    public static void main(String[] args) {


        Casa casa1 = new Casa("Rua a", "2022-11-01",
                "2022-11-15", "2022-11-15", "12",
                "Salvador", "terminado", 200, 2,4);


       Departamento apt1 = new Departamento("Rua a", "2022-11-01",
               "2022-11-15", "2022-11-15", "12",
               "Salvador", "terminado", 20, 4);

        Departamento apt2 = new Departamento("Rua a", "2022-11-01",
                "2022-11-15", "2022-11-15", "12",
                "Salvador", "terminado", 13, 4);


        ArrayList<Departamento> lista = new ArrayList<>();

        lista.add(apt2);
        lista.add(apt1);

        Collections.sort(lista);

        System.out.println(lista);

    }





}
