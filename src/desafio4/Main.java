package desafio4;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta("Matheus", "48278820880", 45000);
        System.out.println(conta);


        System.out.println("\t1)Depositar\n" +
                "\t2)Sacar\n" +
                "\t3)Transferir\n" +
                "\t4)Pagar\n" +
                "\t0)Sair");


        //  conta.depositar(50); ++
        conta.transferir(20.50);
        // conta.pagar(40); -
        conta.sacar(20.50);
    }

}
