package ifpe.poo.logica;

import java.util.Scanner;

public class AreaTrapezio {
	public static void runTest() {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor da base maior do trapézio (em cm):");
        double baseMaior = sc.nextDouble();
        
        System.out.println("Digite o valor da base menor do trapézio (em cm):");
        double baseMenor = sc.nextDouble();
        
        System.out.println("Digite o valor da altura do trapézio (em cm):");
        double altura = sc.nextDouble();
        
        double area = ((baseMaior + baseMenor) * altura) / 2;
        
        System.out.printf("A área do trapézio em cm² é %.2f%n", area);
        
        sc.close();
	}
}
