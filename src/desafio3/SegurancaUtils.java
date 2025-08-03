package desafio3;

public class SegurancaUtils {
    public static boolean validarSenhaForte(String senha) {
        if (senha.length() <= 8) return false;
        return senha.matches(".*\\d.*"); // pelo menos um número
    }
}

