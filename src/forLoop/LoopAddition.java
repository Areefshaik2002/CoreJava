package forLoop;

import java.util.Scanner;

public class LoopAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter From: ");
		int From  = sc.nextInt();
		System.out.println("enter To: ");
		int To = sc.nextInt();
		int sum = 0;
		
		for(int i = From ; i<= To ; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		sc.close();
	}
 
}
