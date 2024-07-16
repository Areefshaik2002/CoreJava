package oops;

import java.util.Scanner;

public class Banking{
	 long AccountNumber;
	 int balance=1000;
	 int amount;
	 int PIN;
	 int PASS;
	 public void WithDraw(int Amount) {
		 balance = balance - amount;
		System.out.println("transaction succesfull!");
		
	 }
	 public void Deposit(int Amount) {
			balance = balance+amount;
			System.out.println("transaction succesfull!");
			
		 }
	 public static void main(String[] args) {
		 	Banking banking = new Banking();
		 	int PASS =1234;
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("Enter your account number: ");
			long AccountNumber = sc.nextLong();
			System.out.println("Enetr your PIN:");
			int PIN = sc.nextInt();
			if(AccountNumber==123456789 && PASS == PIN) {
			System.out.println("Enter 1 for amount withdrawl");
			System.out.println("Enter 2 for Amount Deposit");
			int n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("Enter your Amount:");
				int amount = sc.nextInt();
				banking.WithDraw(amount);
				double balance=10000;
				 balance = balance - amount;
				 System.out.println(balance);
				break;
			case 2:
				System.out.println("Enter your Amount:");
				  amount = sc.nextInt();
				 banking.Deposit(amount);
				 balance  = 1000;
				 balance = balance + amount;
				 System.out.println(balance);

				 break;
			}
			}
			else {
				System.out.println("wrong Credentials");
			}
			sc.close();
	 }
}



	
