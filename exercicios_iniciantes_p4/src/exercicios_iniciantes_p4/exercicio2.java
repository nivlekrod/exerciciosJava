package exercicios_iniciantes_p4;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

		Scanner sc = new Scanner(System.in);

		int valor_contagem, soma_in, soma_out;

		valor_contagem = sc.nextInt(); // valor int n;

		soma_in = 0;
		soma_out = 0;
		for (int i = 0; i < valor_contagem; i++) {
			int valor = sc.nextInt(); // valores int x
			if (valor >= 10 && valor <= 20) {
				soma_in += 1;
			} else {
				soma_out += 1;
			}
		}

		System.out.println(soma_in + " in [10,20]");
		System.out.println(soma_out + " out [10,20]");

		sc.close();

	}

}
