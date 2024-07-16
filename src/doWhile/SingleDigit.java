package doWhile;

import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		do {
			sum = 0;
			while(n>0) {
				int rem = n%10;
				sum+=rem;
				n/=10;
			}
			n = sum;
		}while(sum>9);
		System.out.println(sum);
		
		sc.close();
	}
	
}
	