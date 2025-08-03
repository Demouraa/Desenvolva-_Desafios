package desafio3;

public class Main {
    public static void main(String[] args) {
        Administrador admin = new Administrador("João", "joao@email.com", "admin123");

        // Tentativas de acesso direto aos atributos:
        System.out.println("Acessando atributos diretamente:");
        System.out.println("Nome: " + admin.nome); // OK (public)
        // System.out.println("Email: " + admin.email); // OK (protected) – só acessível se estiver no mesmo pacote
        // System.out.println("Senha: " + admin.senha); // ERRO (private) – não acessível

        // Exibir informações do usuário
        admin.exibirUsuario();

        // Autenticação
        System.out.println("\nAutenticando com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticando com 'senhaErrada': " + admin.autenticar("senhaErrada"));

        // Teste de redefinição de senha
        System.out.println("\nTentando redefinir com senha fraca:");
        admin.redefinirSenha("abc");

        System.out.println("\nTentando redefinir com senha forte:");
        admin.redefinirSenha("novaSenha123");

        // Validação direta com utilitário
        System.out.println("\nTestando utilitário:");
        System.out.println("Senha 'abc123' é forte? " + SegurancaUtils.validarSenhaForte("abc123"));
        System.out.println("Senha 'minhaSenha123456' é forte? " + SegurancaUtils.validarSenhaForte("minhaSenha123456"));
    }
}

