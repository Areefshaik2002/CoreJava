package forLoop;

import java.util.Scanner;

public class PrimeUsingBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number,n: ");
		int n = sc.nextInt();
		boolean flag =true;

		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				flag = false;
				
			}
		}
		System.out.println(flag);

		
sc.close();
	}

}
