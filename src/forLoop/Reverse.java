package forLoop;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		int rev = 0;
		int rem;
		for(;n!=0;n/=10) {
			
		  rem = n % 10;
			rev = rev * 10 + rem;
		}
		System.out.println(rev);
		sc.close();
			
			
		}
		
}
