package ifpe.poo.logica;

import java.util.Scanner;

public class ImparOuPar {
	public static void runTest() {
		Scanner sc = new Scanner(System.in);
		
		int number; 
		String oddOrPair;
		
		System.out.println("Digite o número: ");
		number = sc.nextInt();
		
		oddOrPair = (number % 2 == 0) ? "O número é par. " : "O número é ímpar";
		
		System.out.print(oddOrPair);
		
		sc.close();
	}
}
