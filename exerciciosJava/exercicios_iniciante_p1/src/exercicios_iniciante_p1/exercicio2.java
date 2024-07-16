package exercicios_iniciante_p1;
import java.util.Scanner;
import java.util.Locale;

public class exercicio2 {

	public static void main(String[] args) {
/*
 * Faça um programa para ler o valor do raio de um círculo, e depois
 * mostrar o valor da área deste círculo com quatro casas decimais
 * conforme exemplos. 
 * 		- Fórmula da área: area = π . raio^2
 * Considere o valor de π = 3.14159
*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, pi, area;
		
		raio = sc.nextDouble();
		pi = 3.14159;
		area = pi*Math.pow(raio, 2);
		
		System.out.printf("A = %.4f", area);
		
		sc.close();
	}

}
