package switchCase;
import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a lower case character, ch: ");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'a','e','i','o','u'->
		
			System.out.println("it is a vowel");
			
		case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'->
			System.out.println("it is a consonant");
			default->
			System.out.println("invalid alphabet");
			
			
		}
		sc.close();
		
	}

}
