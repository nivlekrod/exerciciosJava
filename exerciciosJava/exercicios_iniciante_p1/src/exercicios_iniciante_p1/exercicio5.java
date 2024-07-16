package exercicios_iniciante_p1;
import java.util.Scanner;
import java.util.Locale;

public class exercicio5 {

	public static void main(String[] args) {
// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, numPecas1, peca2, numPecas2;
		double valorPeca1, valorPeca2, valorTotal;
		
		peca1 = sc.nextInt();
		numPecas1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();

		peca2 = sc.nextInt();
		numPecas2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		valorTotal = numPecas1 * valorPeca1 + numPecas2 * valorPeca2;
		
		System.out.printf("VALOR A PAGAR = %.2f", valorTotal);
		
		sc.close();
	}

}
