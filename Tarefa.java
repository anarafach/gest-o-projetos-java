public class Tarefa {

    private String nomeTarefa;
    private String descricao;
    private String status;
    private Usuario responsavel;

    public Tarefa(String nomeTarefa, String descricao, String status, Usuario responsavel) {
        this.nomeTarefa = nomeTarefa;
        this.descricao = descricao;
        this.status = status;
        this.responsavel = responsavel;
    }
}
