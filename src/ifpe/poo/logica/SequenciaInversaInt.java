package ifpe.poo.logica;

import java.util.Scanner;

public class SequenciaInversaInt {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 10 números inteiros em sequência:");
		for (int i = 0; i < 10; i++) {
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("A entrada inicia em ordem inversa é: ");
		for (int i = 9; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		sc.close();
	}	
}
