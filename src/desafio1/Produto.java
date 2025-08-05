package desafio1;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    // Dois construtores
    // 1 Construtor que define todos os atributos
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    //1 Construtor que define apenas nome e preco, com estoque = 0
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    //Metodo para adicionar ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
        }
    }

    //Metodo para vender produtos (só se houver estoque suficiente)
    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para venda.");
        } else if (quantidade > 0 && quantidade <= estoque) {
            this.estoque -= quantidade;
            System.out.println("Venda realizada com sucesso.");
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }

    //Metodo para exibir resumo do produto
    public void exibirResumo() {
        System.out.println("desafio1.Produto: " + nome + "\n");
        System.out.println("Preço: R$ " + preco + "\n");
        System.out.println("Estoque: " + estoque + " unidades" + "\n");
    }
}

