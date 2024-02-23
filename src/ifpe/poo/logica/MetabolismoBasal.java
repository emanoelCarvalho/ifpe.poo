package ifpe.poo.logica;

import java.util.Scanner;

public class MetabolismoBasal {
    public static void runtest() {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Calculadora de Taxa de Metabolismo Basal (TMB)");
        System.out.println("Digite o sexo (M para masculino, F para feminino):");
        String gender = scanner.nextLine();

        System.out.println("Digite a idade:");
        int age = scanner.nextInt();

        System.out.println("Digite a altura em centímetros:");
        float high = scanner.nextFloat();

        System.out.println("Digite o peso em quilogramas:");
        float weigth = scanner.nextFloat();

        double tmb;

        if (gender.equalsIgnoreCase("M")) {
            tmb = 66.5 + (13.75 * weigth) + (5.003 * high) - (6.755 * age);
        } else {
            tmb = 655.1 + (9.563 * weigth) + (1.850 * high) - (4.676 * age);
        }

        System.out.println("A taxa de metabolismo basal é: " + tmb + " calorias por dia.");

        scanner.close();
    }
}
