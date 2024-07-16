package forLoop;

import java.util.Scanner;

 public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++) {
		    int fact =1;
	     for(int j = 1;j<=i;j++) {
				fact = fact * j;

			}
			System.out.println(fact);

		}
sc.close();
	}
	
	}
 
 
