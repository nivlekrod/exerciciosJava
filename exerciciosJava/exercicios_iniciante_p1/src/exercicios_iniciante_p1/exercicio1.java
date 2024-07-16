package exercicios_iniciante_p1;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma  mensagem explicativa, conforme exemplos.
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		soma = num1 + num2;

		System.out.printf("SOMA = %d", soma);
		
		sc.close();
	}
}
