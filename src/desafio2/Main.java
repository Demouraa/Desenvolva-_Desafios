package desafio2;

public class Main {
    public static void main(String[] args) {
        Reembolso r1 = new Reembolso("Carla", 5);
        Reembolso r2 = new Reembolso("João", 10);
        Reembolso r3 = new Reembolso("Mariana", 8);

        // r1 - sem hospedagem
        double total1 = r1.calcularReembolso(100.0, 50.0);
        r1.imprimirResumoReembolso(total1);

        // r2 - com hospedagem
        double total2 = r2.calcularReembolso(150.0, 60.0, 100.0);
        r2.imprimirResumoReembolso(total2);

        // r3 - com hospedagem
        double total3 = r3.calcularReembolso(120.0, 40.0, 80.0);
        r3.imprimirResumoReembolso(total3);
    }
}
