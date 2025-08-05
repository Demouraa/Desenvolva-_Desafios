package desafio1;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Camisa", 59.90, 10);
        Produto p2 = new Produto("Calça", 89.90);

        p2.adicionarEstoque(5);
        p1.vender(3);
        p2.vender(10);

        p1.exibirResumo();
        p2.exibirResumo();
    }
}