package ifpe.poo.logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número correspondente à operação que deseja:");
        System.out.println("Digite 1 para calcular o IMC ou 2 para calcular a Taxa de Metabolismo Basal");

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                examImc();
                break;
            case 2:
                examTmb(); 
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    private static void examImc() {
        Imc imc = new Imc();
        imc.runtest();
    }

    private static void examTmb() {
        MetabolismoBasal tmb = new MetabolismoBasal();
        tmb.runtest();
    }
}
