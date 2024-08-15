package exercicios_iniciantes_p4;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
		
		Scanner sc = new Scanner(System.in);

		int numero;
		
		numero = sc.nextInt();
		for(int i = 1; i <= numero; i++) {
			int primeiro = i;
			int segundo = (int) Math.pow(i, 2);
			int terceiro = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d\n", primeiro, segundo, terceiro);
		}
		
		sc.close();
		
	}

}
