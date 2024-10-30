package practice;

public class SubStringCount {
	public static int CountOccurence(String s1, String s2) {
		int count=0, fromIndex=0;
		while((fromIndex = s1.indexOf(s2, fromIndex))!=-1) {
			count++;
//			System.out.println(count);
			fromIndex+=s2.length();
//			System.out.println(fromIndex);
			
		}
		return count;
		
	}
	public static void main(String[] args) {
		String s1 = "bcabcbcabc";
		String s2 = "abc";
		System.out.println(CountOccurence(s1, s2));

	}

}
