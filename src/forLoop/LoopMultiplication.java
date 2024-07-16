package forLoop;

import java.util.Scanner;

public class LoopMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter From: ");
		int From  = sc.nextInt();
		System.out.println("enter To: ");
		int To = sc.nextInt();
		double Mul = 1;
		
		for(int i = From ; i<= To ; i++) {
			Mul = Mul * i;
		}
		System.out.println(Mul);
		sc.close();

	}

}
