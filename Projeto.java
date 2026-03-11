package model;

public class Projeto {

    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private StatusProjeto status;

    public Projeto(String nome, String descricao, String dataInicio, String dataFim, StatusProjeto status) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public StatusProjeto getStatus() {
        return status;
    }

    public void atualizarStatus(StatusProjeto novoStatus) {
        this.status = novoStatus;
    }
}
