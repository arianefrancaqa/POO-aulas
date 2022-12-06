package com.aula19Continuacao;

public class ProdutoFactory {

    private static ProdutoFactory instance;

    public ProdutoFactory() {
    }

    public static ProdutoFactory getInstance(){
        if(instance == null){
            instance = new ProdutoFactory();
        }
        return instance;
    }

    public static Produto criaProduto(String tipo, double peso, double comprimento, double altura, double largura, double raio){
        if (tipo.equals("CAIXA10X10")){
            Caixa caixa = new Caixa(10,10,10,10);
            caixa.setAltura(altura);
            caixa.setComprimento(comprimento);
            caixa.setLargura(largura);
            caixa.setPeso(peso);

        }else if(tipo.equals("FUTEBOL")){
            Bola bolaFutebol = new Bola(200,11);
            bolaFutebol.setRaio(raio);
            bolaFutebol.setPeso(peso);

        }else if(tipo.equals("BOLATENIS")){
            Bola bolaTenis = new Bola(10,0.32);
            bolaTenis.setPeso(peso);
            bolaTenis.setRaio(raio);
        }
        return null;
    }
}
