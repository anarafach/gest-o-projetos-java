package model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private String nomeEquipe;
    private String descricao;
    private List<Usuario> membros;

    public Equipe(String nomeEquipe, String descricao) {
        this.nomeEquipe = nomeEquipe;
        this.descricao = descricao;
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Usuario usuario) {
        membros.add(usuario);
    }

    public List<Usuario> getMembros() {
        return membros;
    }
}
