package com.aula14.mesaTrabalho;

public class Container implements Comparable<Container>{
    private int numeroId;
    private String descricao;
    private String paisOrigem;
    private boolean materialPerigoso;

    public Container(int numeroId, String descricao, String paisOrigem, boolean materialPerigoso) {
        this.numeroId = numeroId;
        this.descricao = descricao;
        this.paisOrigem = paisOrigem;
        this.materialPerigoso = materialPerigoso;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean isMaterialPerigoso() {
        return materialPerigoso;
    }

    public void setMaterialPerigoso(boolean materialPerigoso) {
        this.materialPerigoso = materialPerigoso;
    }

    @Override
    public int compareTo(Container o) {

        return 0;
    }

    public int qtdContainersDesconhecidosPerigosos(){
        int qtdContainers = 0;

        if( getPaisOrigem() == "Desconhecido" && isMaterialPerigoso() == true){
            return qtdContainers++;
        }

        return 0;
    }
}
