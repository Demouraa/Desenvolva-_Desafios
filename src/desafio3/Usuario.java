package desafio3;

public abstract class Usuario {
    private String senha;
    protected String email;
    public String nome;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    protected boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }

    public abstract boolean autenticar(String senha);

    public final void exibirUsuario() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }

    // Método usado apenas para redefinição interna
    protected void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }
}
