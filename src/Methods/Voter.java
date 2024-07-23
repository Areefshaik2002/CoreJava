package Methods;

import java.util.Scanner;

public  class Voter {
		public static void Good(int Age) {
			if(Age >= 18 ) {
				System.out.println("Eligible to vote");
			}else {
				System.out.println("Ineligible to vote");
			}
			
		}
	
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int Age = sc.nextInt();
		Voter.Good(Age);
		sc.close();
		
	}

}
