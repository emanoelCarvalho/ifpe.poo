package ifpe.poo.logica;

import java.util.Scanner;

public class NumberBigger {
	public static void runTest() {
		Scanner sc = new Scanner(System.in);
		
		int numberOne; 
		int numberTwo; 
		String numberBigger; 
		
		System.out.println("Digite o 1° e o 2° número: ");
		
		numberOne = sc.nextInt();
		numberTwo = sc.nextInt();
		
		numberBigger = (numberOne > numberTwo) ? "O primeiro é o maior." : "O segundo é maior.";
		
		System.out.print(numberBigger);
		
		sc.close();
	}
}
