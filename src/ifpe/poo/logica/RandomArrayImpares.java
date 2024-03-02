package ifpe.poo.logica;

import java.util.Random;

public class RandomArrayImpares {
	public static void runTest() {
	    int[] numbers = randomArray();
		
		System.out.println("Elementos ímpares do array: ");
		for (int number : numbers) {
			if (number % 2 != 0) {
				System.out.print(number + " ");
			}
		}
	}

	private static int[] randomArray() {
		Random random = new Random();
		
		int[] numbers = new int[100];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(1000);
		}
		return numbers;
	}
}
