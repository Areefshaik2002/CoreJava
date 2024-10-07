package practice;

public class StringSubsequenceOrNot {
	public static boolean Subsequence(String s1, String s2) {
		int i=0; 
		int j=0;
		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i)==s2.charAt(j)) {
				i++;
			}
			j++;
		}
		return i==s1.length();
		
	}
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "ahfsbjhkc";
		System.out.println(Subsequence(s1,s2));
	}
}
