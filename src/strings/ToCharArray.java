package strings;

public class ToCharArray {
public static void main(String[] args) {
	String s = "java developer";
	char[] c = s.toCharArray();
	for(char i : c) {
		System.out.print(i);
	}
}
}
