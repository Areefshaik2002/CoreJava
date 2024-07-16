package switchCase;
import java.util.Scanner;
public class DaysInMonth {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a month: ");
		int month = sc.nextInt();
		System.out.println("enter a year: ");
		int year = sc.nextInt();
		 switch(month) {
		 //case 1,3,5,7,8,10,12: 
		 //condition above is also be accepted
		 case 1:
		 case 3:
		 case 5:
		 case 7:
		 case 8:
		 case 10:
		 case 12:
			 System.out.println("31 days");
			 break;
		 case 4:
		 case 6:
		 case 11:
		 case 9:
			 System.out.println("30 days");
		 case 2:
			 if(year%4==0 && year%100!=0 || year%400==0)
				 System.out.println("29 days");
			 else
				 System.out.println("28days");
			 break;
			 default:
			 System.out.println("invalid month");

			
		 }
		
		
		sc.close();
		}
	}
