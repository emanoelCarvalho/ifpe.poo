package ifpe.poo.logica;

import java.util.Random;

public class RandomMaiorMenorElemento {
	public static void runTest() {
		Random random = new Random();
		
		int[] numbers = new int[100];
		
		for (int i = 0; i <  numbers.length; i++) {
			numbers[i] = random.nextInt(1000);
		}
		
		System.out.println("O elemento maior e menor do array, respectivamente: ");
		
		int maior = numbers[0];
		int menor = numbers[0];
		
		for (int j = 1; j < numbers.length; j++) {
			if (maior < numbers[j]) {
				maior = numbers[j];
			}
			
			if (menor > numbers[j]) {
				menor = numbers[j];
			}
		}
		
		System.out.print(maior + " " + menor + " ");
	}
}
