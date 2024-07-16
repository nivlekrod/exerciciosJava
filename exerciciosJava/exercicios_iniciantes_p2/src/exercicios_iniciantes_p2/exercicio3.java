package exercicios_iniciantes_p2;
import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente. 
		Scanner sc = new Scanner(System.in);
		
		int numA, numB;
		
		System.out.println("Digite dois números inteiros: ");
		numA = sc.nextInt();
		numB = sc.nextInt();
		
		if (numA % numB == 0 || numB % numA == 0) {
			System.out.println("SÃO MULTIPLOS");
		} else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
		sc.close();
	}
	
}
