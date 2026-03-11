public class Projeto {

    private String nomeProjeto;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String status;

    public Projeto(String nomeProjeto, String descricao, String dataInicio, String dataFim, String status) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }
}
