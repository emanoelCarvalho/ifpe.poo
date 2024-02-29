package ifpe.poo.logica;

import java.util.Random;

public class RandomArray {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numbers = new int[100];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		
		System.out.println("Elementos do array: ");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
		
		System.out.println("Elementos do array em ordem inversa: ");
		for (int i = numbers.length - 1; i >= 0; i-- ) {
			System.out.print(numbers[i] + " ");
		}
	}
}
