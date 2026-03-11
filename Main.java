import model.*;

public class Main {

    public static void main(String[] args) {

        Usuario gerente = new Usuario(
                "Ana Silva",
                "00000000000",
                "ana@email.com",
                "Gerente",
                "ana",
                "123"
        );

        Projeto projeto = new Projeto(
                "Sistema de Gestão de Projetos",
                "Sistema para gerenciamento de equipes",
                "01/03/2026",
                "30/03/2026",
                StatusProjeto.PLANEJADO
        );

        System.out.println("Projeto criado: " + projeto.getNome());
        System.out.println("Gerente responsável: " + gerente.getNome());
    }
}
