package forLoop;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for(int i = 1;i<=20;i++) {
		for(int j=1;j<=10;j++)
			System.out.println(i+" * "+j+" = "+i*j);
	}
	sc.close();
}
}
		
	
