package ifpe.poo.logica;

import java.util.Scanner;

public class MediaAritmetica {
	public static void runTest() {
		/*Escreva um algoritmo em Java que solicite 5 notas e realize o c ́alculo da m ́edia aritm ́etica ao t ́ermino
        da execução**/
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float nota5;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite cada uma das notas, repectivamente");

		nota1 = sc.nextFloat();
		nota2 = sc.nextFloat();
		nota3 = sc.nextFloat();
		nota4 = sc.nextFloat();
		nota5 = sc.nextFloat();

		sc.close();

		float mediaAritmetica = ((nota1 + nota2 + nota3 + nota4 + nota5) / 5);
		System.out.println("Sua média aritmética é: " + mediaAritmetica);
	}
}
