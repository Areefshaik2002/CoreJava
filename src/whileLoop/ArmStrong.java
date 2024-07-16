package whileLoop;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		int count = 0;
		while(n!=0) {
			count++;
			n/=10;
		}
		n = temp;
		while(n!=0) {
			int rem = n%10;
			int power = 1;
			for(int i=1;i<=count;i++) {
				power = power*rem;
			}
			sum+=power;
			n/=10;
		}
if(sum==temp) {
	System.out.println("armstrong number");
}else {
	System.out.println("not a armstrong number");
}
sc.close();
	}

}
