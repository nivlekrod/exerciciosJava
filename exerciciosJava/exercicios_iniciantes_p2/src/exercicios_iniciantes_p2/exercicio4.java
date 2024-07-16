package exercicios_iniciantes_p2;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Digite qual foi a hora inicial e final do jogo: ");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.printf("O jogo durou %d\n", duracao);
		} else {
			duracao = 24 - horaInicial + horaFinal;
			System.out.printf("O jogo durou %d\n", duracao);
		}
		
		sc.close();
	}
}
