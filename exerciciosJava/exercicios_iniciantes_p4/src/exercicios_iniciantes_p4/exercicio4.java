package exercicios_iniciantes_p4;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". 
		
		Scanner sc = new Scanner(System.in);
		
		int contador;
		
		contador = sc.nextInt();
		
		for (int i = 0; i < contador; i++) {
			int divisor = sc.nextInt();
			int dividendo = sc.nextInt();
			if (dividendo != 0) {
				double resultado = (double) divisor/dividendo;
				System.out.println(resultado);
			} else {
				System.out.println("Divisão Impossivel");
			}
		}
		
		sc.close();
		
	}

}
