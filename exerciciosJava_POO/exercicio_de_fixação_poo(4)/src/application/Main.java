package application;
import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		double qtyDollar = sc.nextDouble();
		double reais = CurrencyConverter.dollarToReal(dollar, qtyDollar);
		System.out.printf("Amount to be paid in reais = %.2f\n", reais);
		
		sc.close();
	}

}
