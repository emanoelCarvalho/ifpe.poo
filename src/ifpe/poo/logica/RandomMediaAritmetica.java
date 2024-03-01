package ifpe.poo.logica;

import java.util.Random;

public class RandomMediaAritmetica {
	public static void runTest() {
		Random random = new Random();
		
		int[] numbers = new int[100];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(101);
		}
		System.out.println("A média aritmética de 100 números aléatórios é: ");
		
		int sum = 0;
		int media = 0;
		
		for (int j = 0; j < numbers.length; j++) {
			sum += numbers[j]; 
		}
		
		media = sum / numbers.length; 
		
		System.out.print(media);
	}
}
