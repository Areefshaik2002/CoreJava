package strings;
public class ReverseString {
public static void main(String[] args) {
	String s1 = "Hello Areef, how are you?";
	String s2 = s1.substring(6);
	String s3 = s1.substring(0, 5);
	System.out.println(s2);
	System.out.println(s3);
	String rev = "";
	for(int i=s2.length()-1;i>=0;i--) {
		rev = rev + s2.charAt(i);
	}
	System.out.println(s3+" "+rev);

}
}
