package model;

public class Tarefa {

    private String titulo;
    private String descricao;
    private String status;
    private Usuario responsavel;

    public Tarefa(String titulo, String descricao, String status, Usuario responsavel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.responsavel = responsavel;
    }

    public void atualizarStatus(String status) {
        this.status = status;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }
}
