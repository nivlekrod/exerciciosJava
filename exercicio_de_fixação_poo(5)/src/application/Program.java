package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
		} else {
			account = new Account(number, name);
		}
		
		System.out.println("Account data: \n" + account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: \n" + account);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.deposit(withdrawValue);
		System.out.println("Updated account data: \n" + account);
		
		sc.close();
	}

}
