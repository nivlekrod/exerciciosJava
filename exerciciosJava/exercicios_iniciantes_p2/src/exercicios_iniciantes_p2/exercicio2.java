package exercicios_iniciantes_p2;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
