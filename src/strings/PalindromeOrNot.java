package strings;
public class PalindromeOrNot {
public static boolean isPalimdrome(String s) {
		char[] c = s.toCharArray();
		int i = 0; int j = c.length-1;
		while(i<j) {
		if(c[i]!=c[j]) {
			return false;
		}
		i++;
		j--;
	}
		return true;
	}
public static void main(String[] args) {
	System.out.println(PalindromeOrNot.isPalimdrome("wowow"));
	
}
}
