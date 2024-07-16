package forLoop;

import java.util.Scanner;

public class OneToHundred {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter I: ");
	int I = sc.nextInt();
	System.out.println("enter c: ");
	int c = sc.nextInt();
	for(int i = I; i<=c; i++) {
		if(i%2==0) {
		System.out.println(i+" is even");
		}
		else if(i%2!=0) {
			System.out.println(i+" is odd");
		}
	}
	sc.close();
}
}
