package exceptions;

public class Example {
public static void main(String[] args) {
//	Null pointer Exception
		String s = null;
		try {
			int length = s.length();
			System.out.println(length);
		}
		catch(NullPointerException N) {
			System.out.println("You cannot get length for a string that's value is null");
		}
		System.out.println("lets continue");
		System.out.println(s);
	}
}