package exercicios_iniciantes_p3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). 

		Scanner sc = new Scanner(System.in);

		double x, y;

		x = sc.nextDouble();
		y = sc.nextDouble();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro quadrante");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro quadrante");
			} else {
				System.out.println("quarto quadrante");
			}

			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		sc.close();
	}

}
