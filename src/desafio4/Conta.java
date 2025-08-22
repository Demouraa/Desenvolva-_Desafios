package desafio4;

public class Conta {
    protected String titular;
    protected String numeroDaconta;
    protected double saldo;

    public Conta(String titular, String numeroDaconta, int saldo) {
        this.titular = titular;
        this.numeroDaconta = numeroDaconta;
        this.saldo = saldo;
    }

    public boolean verificarSeNaoTemSaldo(double valor) {
        if(valor >= saldo + 0.50) {
            System.out.println("Saldo Insuficiente");
            return true;
        }
        return false;
    }

    public void sacar(double valorDoSaque) {
        if(verificarSeNaoTemSaldo(valorDoSaque)) {
            return;
        }
        if(valorDoSaque >= 20) {
            saldo -= valorDoSaque;
            saldo = saldo - 0.50;
            System.out.println("Saque de "+ valorDoSaque + " realizado com sucesso!" + "\nNovo saldo de: " + saldo);
            return;
        }
        System.out.println("Saque minimo precisa ser de 20R$");
    }

    public void transferir(double valorTransferencia) {
        if(verificarSeNaoTemSaldo(valorTransferencia)) {
            return;
        }
        if(valorTransferencia >= 30) {
            saldo -= valorTransferencia;
            saldo = saldo - 0.50;
            System.out.println("Transferencia de "+ valorTransferencia + " realizado com sucesso!" + "\nNovo saldo de: " + saldo);
            return;
        }
        System.out.println("Transferencia minima precisa ser de 30R$");
    }

    public void pagar(double valorParaPagar) {
        if(verificarSeNaoTemSaldo(valorParaPagar)) {
            return;
        }

    }



    @Override
    public String toString() {
        return "Titular:" + titular +
                "\nConta:" + numeroDaconta +
                "\nSaldo:" + saldo + "R$";
    }
}

