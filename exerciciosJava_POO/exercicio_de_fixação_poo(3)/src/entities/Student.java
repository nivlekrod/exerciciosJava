package entities;

public class Student {
//Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema.
	
	public String name;
	public double grade_1;
	public double grade_2;
	public double grade_3;
	
	public double finalGrade() {
		return grade_1 + grade_2 + grade_3;
	}
	
	public double missingPoints() { 
		if (finalGrade() < 60.0) { 
			return 60.0 - finalGrade(); 
		} else { 
			return 0.0; 
		}
	} 
}
