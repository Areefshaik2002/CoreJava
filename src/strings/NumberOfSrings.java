package strings;

public class NumberOfSrings {
	public static boolean isPalindrome(String s) {
//	char[] c = s.toCharArray(); 
	int i=0;int j=s.length()-1;
	while(i<j) {
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}
	public static int NoOfPalindrome(String s) {
		int count = 0;
		int n=s.length();
		for(int length=1; length<=n;length++) {
			for(int k=0;k<=n-length;k++) {
				String substring = s.substring(k, k+length);
				if(isPalindrome(substring)) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String string = "wowow";
		System.out.println(NoOfPalindrome(string));
		
	
	}}

