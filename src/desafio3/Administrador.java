package desafio3;

public class Administrador extends Usuario {

    public Administrador(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return verificarSenha(senha);
    }

    public void redefinirSenha(String novaSenha) {
        if (SegurancaUtils.validarSenhaForte(novaSenha)) {
            setSenha(novaSenha);
            System.out.println("Senha redefinida com sucesso.");
        } else {
            System.out.println("Senha fraca. A senha deve ter mais de 8 caracteres e pelo menos um número.");
        }
    }
}
