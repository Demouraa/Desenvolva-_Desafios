package desafio2;

public class Reembolso {
    String nomeFuncionario;
    int diasTrabalhados;

    public Reembolso(String nomeFuncionario, int diasTrabalhados) {
        this.nomeFuncionario = nomeFuncionario;
        this.diasTrabalhados = diasTrabalhados;
    }

    public double calcularReembolso(double alimentacao, double transporte, double hospedagem) {
        return alimentacao + transporte + hospedagem;
    }

    public double calcularReembolso(double alimentacao, double transporte) {
        return alimentacao + transporte;
    }

    public void imprimirResumoReembolso(double valorTotal) {
        if (diasTrabalhados > 7) {
            valorTotal *= 1.10; // aplica bônus de 10%
        }

        System.out.printf("Funcionário: %s – Dias Trabalhados: %d – Reembolso Total: R$ %.2f%n",
                nomeFuncionario, diasTrabalhados, valorTotal);
    }
}

