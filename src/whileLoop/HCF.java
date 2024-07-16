package whileLoop;
import java.util.Scanner;
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a: ");
		int a = sc.nextInt();
		System.out.println("enter b: ");
		int b = sc.nextInt();
		int n = (a<b)?a:b;
		while(true) {
		if(a%n==0 && b%n==0) {
			break;
		}
		n--;
		} 
		System.out.println(n);
		sc.close();
	}

}
