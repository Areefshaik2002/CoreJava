package forLoop;

//import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		

		for(int i =1; i<=6; i++) {
			int count =0;
			for(int j = 1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}				
			}
			System.out.println(i+":"+count);

		}

	}

}