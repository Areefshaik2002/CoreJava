package strings;

public class StringMethods {
public static void main(String[] args) {
	String s1 = "AreefShaik";
//	System.out.println(s1.length());
//	charAT method
//	System.out.println(s1.charAt(0));
//	char c = s1.charAt(9);
//	System.out.println(c);
//	printing all the characters
//	for(int i=0;i<s1.length();i++) {
//		char c = s1.charAt(i);
//		System.out.println("index["+i+"]: "+c);
//	}
	
//	methods for converting to upper and lower cases
//	System.out.println(s1.toLowerCase());
//	System.out.println(s1.toUpperCase());
	
//	printing from length() to index[0]
//	for(int i=s1.length()-1;i>=0;i--) {
//		char c = s1.charAt(i);
//		System.out.println("index["+i+"]: "+c);
//	}
	
	String s2 = "asdfghjkl234567sdfgh";
	int sum = 0;
	for(int i=0;i<s2.length();i++) {
		char c = s2.charAt(i);
//		if(c>='0' && c<='9') {
//		System.out.print(c+" ");
//	    }
//		if(c>='a' && c<='z') {
//			System.out.print(c+" ");
//		}
		if(c>='0' && c<='9') {
			int n = c-'0';
			sum+=n;
//			for printing the entire range.
//			System.out.println(sum);
		}
	}
	System.out.println(sum);
}
}
