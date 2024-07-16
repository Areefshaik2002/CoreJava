package forLoop;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter a number, n: ");
	    int n = sc.nextInt();
	   int count = 0;
	   for(int i =1;i<=n;i++) {
		   count = 0;
		   for(int j=1;j<=i;j++) {
			   if(i%j==0) {
				   count++;
				   }
		   }
		   System.out.println(i+" has "+count+" factors ");
	   }
	   sc.close();
	}
}


