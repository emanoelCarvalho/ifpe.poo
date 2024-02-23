package ifpe.poo.logica;
import java.util.Scanner;

public class Imc {
	
	public void runtest() {
		String name;
		float weigth; 
		float high;
		float imc; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome, peso e altura respectivamente");
		name = sc.next();
		weigth = sc.nextFloat();
		high = sc.nextFloat();
		
		sc.close();
		
		imc = (weigth / (high * high));
		
		
		if (imc < 19) {
			System.out.println("Seu imc " + name + " é "+ imc);
			System.out.println("Abaixo do peso");
		} else if (imc >= 19.00 && imc < 25.00) {
			System.out.println("Seu imc " + name + " é "+ imc);
			System.out.println("Peso normal");
		} else {
			System.out.println("Seu imc " + name + " é "+ imc);
			System.out.println("Acima do peso");
		}
	}
}
