package whileLoop;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a: ");
	int a = sc.nextInt();
	System.out.println("enter b: ");
	int b = sc.nextInt();
	int n = (a>b)?a:b;
	while(true) {
		if(n%a==0 && n%b==0) {
			break;
		}
		n++;
	}
System.out.println("the LCM is "+n);
sc.close();
	}

}
