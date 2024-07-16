package whileLoop;

import java.util.Scanner;

public class StrongNumber {
//	strong number-> 123 = 1! + 2! + 3!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n : ");
		int n = sc.nextInt();
		int temp=n;
		int sum = 0;
		
		while(n!=0) {
			
			int rem = n%10;
			int fact =1;
			for( int i=1;i<=rem;i++) {
				fact = fact*i;
				}
			sum = sum + fact;
			n/=10;
			}
		if(sum==temp) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
		
		
sc.close();
	}

}
