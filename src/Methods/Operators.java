package Methods;
import java.util.Scanner;

public class Operators {
		public static void operand(int n1, int n2) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("enter n1:");
			  n1 = sc.nextInt();
			System.out.println("Enter n2: ");
			  n2 = sc.nextInt();
			System.out.println("enter 1 for addition");
			System.out.println("enter 2 for subtraction");
			System.out.println("enter 3 for multiplication");
			System.out.println("enter 4 for divison");
			int n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.println(n1+n2);
			break;
			case 2:
				System.out.println(n1-n2);
				break;
			case 3:
				System.out.println(n1*n2);
				break;
			case 4:
				System.out.println(n1/n2);
				break;
				default:
					System.out.println("invalid operator");
			sc.close();
			}
		}
		public static void main(String[] args) {
			//Operators operator = new Operators();
			operand(6, 3);
			
		}
		}

