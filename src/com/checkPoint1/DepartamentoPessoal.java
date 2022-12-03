package com.checkPoint1;

public class DepartamentoPessoal {
    private String nomeFuncionario;
    private String sobrenomeFuncionario;
    private Integer idFuncionario;
    private String statusFuncionario;

    public DepartamentoPessoal(String nomeFuncionario, String sobrenomeFuncionario, Integer idFuncionario, String statusFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.sobrenomeFuncionario = sobrenomeFuncionario;
        this.idFuncionario = idFuncionario;
        this.statusFuncionario = statusFuncionario;
    }

    public void calcularFolhaPagamentoFuncionarios(Float remuneracao){
        System.out.println( "\nO valor da Folha de Pagamento do Funcionário "+ nomeFuncionario+" "+sobrenomeFuncionario +" é: R$ " + remuneracao+"\n");
    }

    public void calcularFolhaPagamentoFuncionarios(Float remuneracao, Float bonusParticipacao){
        System.out.println("\nO valor da Folha de Pagamento do Funcionário "+ nomeFuncionario+" "+sobrenomeFuncionario +" com bonus é: R$ " + (remuneracao + bonusParticipacao)+"\n");
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSobrenomeFuncionario() {
        return sobrenomeFuncionario;
    }

    public void setSobrenomeFuncionario(String sobrenomeFuncionario) {
        this.sobrenomeFuncionario = sobrenomeFuncionario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getStatusFuncionario() {
        return statusFuncionario;
    }

    public void setStatusFuncionario(String statusFuncionario) {
        this.statusFuncionario = statusFuncionario;
    }
}
