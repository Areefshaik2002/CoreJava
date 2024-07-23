package Methods;

import java.util.Scanner;

public class Marraige {
		public static int Eligible( int expenditure, int revenue) {
			int profit = expenditure - revenue;
			return profit;
			
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is the expenditure?");
		int e = sc.nextInt();
		System.out.println("and what is the actual revenue?");
		int r = sc.nextInt();
		System.out.println("the profit is "+ Marraige.Eligible(r, e));
		sc.close();
	}

}
