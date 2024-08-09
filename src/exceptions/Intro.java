package exceptions;

public class Intro {

	public static void main(String[] args) {
		int a = 20;
		try {
			int div = a/0;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("a/0");
		}
		System.out.println(a);
		int sum = a+10;
		System.out.println(sum);
	}

}
