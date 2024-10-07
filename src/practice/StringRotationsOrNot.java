package practice;

public class StringRotationsOrNot {
	public static boolean StringRotations(String s1, String s2) {
		
		return s1.length()==s2.length() && (s1+s1).contains(s2);
		
	}
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "bcda";
		System.out.println(StringRotations(s1,s2));
	}

	}


