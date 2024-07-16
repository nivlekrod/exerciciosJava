package exercicios_iniciantes_p2;
import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		double preco;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if (cod == 1) {
			preco = 4.00 * qtd;
			//System.out.printf("Total a pagar: R$%.2f\n", preco);
		} else if (cod == 2) {
			preco = 4.50 * qtd;
			//System.out.printf("Total a pagar: R$%.2f\n", preco);
		} else if (cod == 3) {
			preco = 5.00 * qtd;
			//System.out.printf("Total a pagar: R$%.2f\n", preco);
		} else if (cod == 4) {
			preco = 5.50 * qtd;
			//System.out.printf("Total a pagar: R$%.2f\n", preco);
		} else {
			preco = 1.50 * qtd;
			//System.out.printf("Total a pagar: R$%.2f\n", preco);
		}
		
		System.out.printf("Total a pagar: R$%.2f\n", preco);
		
		sc.close();
	}

}
