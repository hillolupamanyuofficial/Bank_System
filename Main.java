package com.bank;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Hillol Global Bank");
		System.out.println("Please Choose the type of Account you want to open");
		System.out.println("1. Savings Account \n2. Current Account");
		
		int option = sc.nextInt();
		while(option != 1 && option != 2) {
			System.out.println("Wrong option ,please enter your choice again");
			option = sc.nextInt();
		}
		
		if(option == 1) {
			SavingsAccount s1 = new SavingsAccount();
			System.out.println("congratulations !!! You have choosen to open a Savings Account at Hillol Global Bank");
			
			System.out.println("\nPlease Enter the following details in sequence -");
			System.out.print("Name:\t");
			String name = sc.next();
			
			System.out.print("Account No(8 digit):\t ");
			double AccountNumber = sc.nextDouble();
			s1.setCustomerDeatils(name, AccountNumber, s1.AccountType);
			
			System.out.print("Starting Balance:\t");
			double startingBalance = sc.nextDouble();
			s1.setBalance(startingBalance);
			
			
			int choice = 0;
			
			while(choice != 6) {
				System.out.println("\nWelcome to HGB banking Menu ...Choose one of the following Operations");
				System.out.println("1.Check Balance    2.Deposit    3.Withdrawal  4.Cheque Status  5.Deposit Interest  6.Quit");
				choice = sc.nextInt();
				System.out.println("\n");
				
				switch(choice) {
				
				case 1:
					s1.displayBalance();
					break;
					
				case 2:
					System.out.print("Enter Amount to deposit\t");
					double depAmount = sc.nextDouble();
					s1.deposit(depAmount);
					break;
					
				case 3:
					System.out.print("Enter Amount to witdraw\t");
					double withdrawAmount = sc.nextDouble();
					s1.withdrawal(withdrawAmount);
					break;
					
				case 4:
					if(s1.isChequeBookFacilityAvailable)
						System.out.println("Cheque Book facilty available");
					else
						System.out.println("Cheque Book facilty Not available");
					break;
					
				case 5:
					System.out.print("Enter the number of years you want to get interest for ");
					int time = sc.nextInt();
					s1.depositInterest(time,s1.rate);
					break;
				
				case 6:
					System.out.println("Thank you for banking in Hillol Global Bank");
					break;
					
				default:
					System.out.println("Wrong choice,please enter your choice again");
				
				}

			}

		}
		else {
			CurrentAccount s1 = new CurrentAccount();
			System.out.println("congratulations !!! You have choosen to open a Current Account at Hillol Global Bank");

						
			System.out.println("\nPlease Enter the following details in sequence -");
			System.out.print("Name:\t");
			String name = sc.next();
			
			System.out.print("Account No(8 digit):\t ");
			double AccountNumber = sc.nextDouble();
			s1.setCustomerDeatils(name, AccountNumber, s1.AccountType);
			
			System.out.print("Starting Balance:\t");
			double startingBalance = sc.nextDouble();
			s1.setBalance(startingBalance);
			
			
			int choice = 0;
			
			while(choice != 5) {
				System.out.println("\nWelcome to HGB banking Menu ...Choose one of the following Operations");
				System.out.println("1.Check Balance    2.Deposit    3.Withdrawal  4.Cheque Status  5.Quit");
				choice = sc.nextInt();
				System.out.println("\n");
				
				switch(choice) {
				
				case 1:
					s1.displayBalance();
					break;
					
				case 2:
					System.out.print("Enter Amount to deposit\t");
					double depAmount = sc.nextDouble();
					s1.deposit(depAmount);
					break;
					
				case 3:
					System.out.print("Enter Amount to witdraw\t");
					double withdrawAmount = sc.nextDouble();
					s1.withdrawal(withdrawAmount);
					break;
					
				case 4:
					if(s1.isChequeBookFacilityAvailable)
						System.out.println("Cheque Book facilty available");
					else
						System.out.println("Cheque Book facilty Not available");
					break;
					
				case 5:
					System.out.println("Thank you for banking in Hillol Global Bank");
					break;
					
				default:
					System.out.println("Wrong choice,please enter your choice again");
				
				}

			}

		
		}
		
		
		
		
	}

}
