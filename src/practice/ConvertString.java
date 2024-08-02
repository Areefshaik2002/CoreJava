package practice;

public class ConvertString {
public static void main(String[] args) {
	String s1 = "jAvaDeVeLoPeR";
	for(int i=0;i<=s1.length()-1;i++) {
		char c = s1.charAt(i);
		if(c>='a' && c<='z') {
			System.out.println(s1.toUpperCase());
		}
		if(c>='A' && c<='Z') {
			System.out.println(s1.toLowerCase());
		}
	}
	System.out.println();
}
}
