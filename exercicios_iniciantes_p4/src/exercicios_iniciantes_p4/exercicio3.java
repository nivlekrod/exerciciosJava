package exercicios_iniciantes_p4;

import java.util.Scanner;
import java.util.Locale;

public class exercicio3 {

	public static void main(String[] args) {
// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
// - fórmula da media ponderada = N1*P1 + N2*P2 + ... + Nn*Pn / P1 + P2 + ... + Pn

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valor_contagem;

		valor_contagem = sc.nextInt();

		for (int i = 0; i < valor_contagem; i++) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double num3 = sc.nextDouble();

			double media = (num1 * 2 + num2 * 3 + num3 * 5) / 10;
			System.out.printf("%.1f", media);
		}

		sc.close();

	}

}
