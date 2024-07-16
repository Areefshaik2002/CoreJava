package whileLoop;

import java.util.Scanner;

public class Binary2decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a binary number, n: ");
		int n = sc.nextInt();
		
		int dec=0;
		int  i = 1;
		while(n>0) {
			int rem = n%10;
		    dec = (rem*i)+dec;
		    i*=2;

		    n/=10;
		}
			 System.out.println(dec);
			 sc.close();
	}

}
