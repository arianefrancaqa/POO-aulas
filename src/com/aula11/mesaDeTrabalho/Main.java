package com.aula11.mesaDeTrabalho;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Luna", 3, true, true);
        Cachorro cachorro2 = new Cachorro("Robson", 12, false, false);

        Cavalo cavalo1 = new Cavalo("Chico", 10, false, true);
        Cavalo cavalo2 = new Cavalo("Lolla", 7, true, false);

        Preguica preguica1 = new Preguica("Josefina", 1, false, true);
        Preguica preguica2 = new Preguica("Marina", 4, true, false);

        cachorro1.correr();
        cachorro1.comer();
        cachorro2.correr();

        cavalo1.correr();
        cavalo1.comer();
        cavalo2.correr();

        preguica1.subirEmArvores();
        preguica1.comer();
        preguica2.subirEmArvores();
    }
}
