package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Main {

	public static void main(String[] args) {
//Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Write the name of student: ");
		student.name = sc.nextLine();
		
		System.out.print("Write the 1st grade (max grade is 30): ");
		student.grade_1 = sc.nextDouble();
		while (student.grade_1 > 30) {
			System.out.print("Rewrite the grade (max grade is 30): ");
			student.grade_1 = sc.nextDouble();
		}
		
		System.out.print("Write 2nd grade (max grade is 35): ");
		student.grade_2 = sc.nextDouble();
		while (student.grade_2 > 35) {
			System.out.print("Rewrite the grade (max grade is 35): ");
			student.grade_2 = sc.nextDouble();
		}
		
		System.out.print("Write 3rd grade (max grade is 35): ");
		student.grade_3 = sc.nextDouble();
		if (student.grade_3 > 35) {
			System.out.print("Rewrite the grade (max grade is 35): ");
			student.grade_3 = sc.nextDouble();
		}
		
		System.out.printf("FINAL GRADE = %.2f\n", student.finalGrade());
		if (student.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());			
		} else {
			System.out.print("PASS");
		}
		
		sc.close();
	}

}
