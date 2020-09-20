package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program_Account {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account = null;
			
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)?");
		char initial = sc.next().charAt(0);
		if (initial == 'y' || initial == 'Y' ) {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(numberAccount, holder, initialDeposit);
					
		} else if(initial == 'n' || initial == 'N') {
			account = new Account(numberAccount, holder);
			
		}
		
		System.out.println("Account data:" + account);
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
				
		sc.close();
	}
}