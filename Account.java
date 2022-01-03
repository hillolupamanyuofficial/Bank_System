package com.bank;
import java.math.*;

public class Account {

		String CustomerName;
		double AccountNo;
		String AccountType;
		double balance;
		
		void setCustomerDeatils(String CustomerName,double AccountNo,String AccountType) {
			this.CustomerName = CustomerName;
			this.AccountNo = AccountNo;
			this.AccountType = AccountType;
		}
		
		void setBalance(double balance) {
			this.balance = balance;
		}
		
		void deposit(double amount) {
			balance += amount;
		}
		
		void displayBalance() {
			System.out.println("Your Account Balance is  : Rs " + balance );
		}
		
		void withdrawal(double amount) {
			
			if(balance < amount) {
				System.out.println("Not Sufficient Balance , Withdrawal not possible");
			}
			else
				balance -= amount;  		
		}
		
}

class SavingsAccount extends Account{
	
	final String accountType = "Savings Account";
	final boolean isChequeBookFacilityAvailable = false;
	double interest;
	final double rate = 5;
	
	void depositInterest(int time,double rate) {
		
		interest =balance*Math.pow(1 + rate/100,time) - balance;
		balance += interest;
	}
	
}

class CurrentAccount extends Account{
	String AccountType = "Current Account";
	final boolean isChequeBookFacilityAvailable = true;
	boolean serviceTaxDeducted = false;
	
	void setBalance(double balance) {
		this.balance = balance;
		this.deductServiceCharge();
	}
	
	
	void deductServiceCharge() {
		if(balance < 2500 && serviceTaxDeducted == false) {
			balance -= 100;
			serviceTaxDeducted = true;
		}
	}
	
	
	void withdrawal(double amount) {
		
		if(balance < amount) {
			System.out.println("Not Sufficient Balance , Withdrawal not possible");
		}
		else
			balance -= amount;  
		
		this.deductServiceCharge();
	}
	


}