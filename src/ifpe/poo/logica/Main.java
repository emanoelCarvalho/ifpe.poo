package ifpe.poo.logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número correspondente à operação que deseja:");
        System.out.println("1 - Calcular o IMC");
        System.out.println("2 - Calcular a Taxa de Metabolismo Basal");
        System.out.println("3 - Calcular a Média Aritmética de um Array");
        System.out.println("4 - Gerar e Imprimir um Array Aleatório");
        System.out.println("5 - Gerar e Imprimir um Array com Números Ímpares Aleatórios");
        System.out.println("6 - Gerar e Imprimir um Array com Números Pares Aleatórios");
        System.out.println("7 - Gerar e Imprimir um Array com Números Primos Aleatórios");
        System.out.println("8 - Gerar e Imprimir um Array com o Maior e Menor Elemento Aleatório");
        System.out.println("9 - Calcular a Média Aritmética de um Array Aleatório");
        System.out.println("10 - Imprimir a Sequência Inversa de Números Inteiros");
        
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                runImc();
                break;
            case 2:
                runTmb(); 
                break;
            case 3: 
            	runMediaAritmetica();
            	break;
            case 4: 
            	runRandomArray();
            	break;
            case 5: 
            	runRandomArrayImpares();
            	break;
            case 6: 
            	runRandomArrayPares();
            	break;
            case 7: 
            	runRandomArrayPrimo();
            	break;
            case 8: 
            	runRandomArrayMaiorMenor();
            	break;
            case 9: 
            	runRandoMediaAritmetica();
            	break;
            case 10: 
            	runSequeciaInversa();
            	break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    private static void runImc() {
        Imc imc = new Imc();
        imc.runtest();
    }

    private static void runTmb() {
        MetabolismoBasal tmb = new MetabolismoBasal();
        tmb.runtest();
    }
    
    private static void runMediaAritmetica() {
		MediaAritmetica media = new MediaAritmetica();
		media.runTest();
	}
    
    private static void runRandomArray() {
		RandomArray randomArray = new RandomArray();
		randomArray.runTest();
	}
    
    private static void runRandomArrayImpares() {
		RandomArrayImpares randomArrayImpares = new RandomArrayImpares();
    	randomArrayImpares.runTest();
	}
    private static void runRandomArrayPares() {
		RandomArrayPares randomArrayPares = new RandomArrayPares();
    	randomArrayPares.runTest();
	}
    
    private static void runRandomArrayPrimo() {
    	RandomArrayPrimo randomArrrayPrimo = new RandomArrayPrimo();
    	randomArrrayPrimo.runTest();
    }
    
    private static void runRandomArrayMaiorMenor() {
    	RandomMaiorMenorElemento randomMaiorMenorElemento = new RandomMaiorMenorElemento();
    	randomMaiorMenorElemento.runTest();
    }
    
    private static void runRandoMediaAritmetica() {
    	RandomMediaAritmetica randomMediaAritmetica = new RandomMediaAritmetica();
    	randomMediaAritmetica.runTest();
    }
    private static void runSequeciaInversa() {
    	SequenciaInversaInt sequenciaInversaInt = new SequenciaInversaInt();
    	sequenciaInversaInt.runTest();
    }
}
