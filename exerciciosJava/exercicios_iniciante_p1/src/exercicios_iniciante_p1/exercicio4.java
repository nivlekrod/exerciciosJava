package exercicios_iniciante_p1;
import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {

	public static void main(String[] args) {
// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais. 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int funcionario, horas; 
		double salarioHora, salarioTotal;
		
		funcionario = sc.nextInt();
		horas = sc.nextInt();
		salarioHora = sc.nextDouble();
		
		salarioTotal = salarioHora * horas;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = %.2f", salarioTotal);
		
		sc.close();
	}

}
