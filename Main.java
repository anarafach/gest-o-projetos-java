public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                "Ana",
                "00000000000",
                "ana@email.com",
                "Gerente",
                "ana",
                "123"
        );

        Projeto projeto = new Projeto(
                "Sistema de Gestão",
                "Projeto para gerenciar equipes",
                "01/03/2026",
                "30/03/2026",
                "Em andamento"
        );

        System.out.println("Projeto criado: " + projeto.getNomeProjeto());
        System.out.println("Responsável: " + usuario.getNome());
    }
}
