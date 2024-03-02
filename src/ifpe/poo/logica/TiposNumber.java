package ifpe.poo.logica;

import java.util.Scanner;

public class TiposNumber {
	public static void runTest() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numberInt = sc.nextInt();
		
		System.out.print("Digite um número long: ");
		long numberLong = sc.nextLong();
		
		System.out.print("Digite um número float: ");
		float numberFloat = sc.nextFloat(); 
		
		System.out.printf("O número inteiro digitado foi %d, O número long digitado foi %d, O número float digitado foi %d", numberInt, numberLong, numberFloat);
		
		sc.close();
		
	}
}
