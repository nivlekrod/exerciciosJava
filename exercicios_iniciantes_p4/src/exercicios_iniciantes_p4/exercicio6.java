package exercicios_iniciantes_p4;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
// Ler um número inteiro N e calcular todos os seus divisores. 
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
