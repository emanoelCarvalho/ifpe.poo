package ifpe.poo.logica;

import java.util.Random;

public class RandomArrayPrimo {
	public static void runTest() {
		int[] numbers = randomArray();
		
		System.out.println("Números primos no array: ");
		for (int number : numbers) {
			if (isCousin(number)) {
				System.out.print(number +  " ");
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
	public static boolean isCousin(int number) {
		if (number <= 1) {
			return false; 
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
