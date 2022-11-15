package com.aula4;

import java.time.LocalDate;

public class ObjetoPessoa {
    public  static void main(String[] args){
        Pessoa pessoaFelix = new Pessoa();

        pessoaFelix.respirar();

        Pessoa pessoaHelena = new Pessoa("Helena", 15, LocalDate.now(), 'F');

        pessoaHelena.respirar();

        System.out.println(pessoaHelena.atribuirTitulo(true));
        System.out.println(pessoaHelena.atribuirTitulo(false));

        Pessoa pessoaLuiz = new Pessoa("Luiz", 30, LocalDate.now(), 'M');
        System.out.println(pessoaLuiz.atribuirTitulo(true));

        pessoaHelena.setCorOlho("AZUL");
        Boolean test = pessoaHelena.piscarOlhos();
    }
}
