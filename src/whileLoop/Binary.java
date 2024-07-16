package whileLoop;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println("enter a number,n: ");
		int n = sc.nextInt();
		int bin = 0;
		int i=1;
		while(n>0) {
			int bit=n%2;
			bin = (bit*i)+bin;
			n/=2;
			i*=10;
		}
		
System.out.println(bin);
sc.close();
	}

}
