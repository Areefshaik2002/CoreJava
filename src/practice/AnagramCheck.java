package practice;
public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        
        for (int i = 0; i < chars1.length; i++) {
            for (int j = i + 1; j < chars1.length; j++) {
                if (chars1[i] > chars1[j]) {
                    char temp = chars1[i];
                    chars1[i] = chars1[j];
                    chars1[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < chars2.length; i++) {
            for (int j = i + 1; j < chars2.length; j++) {
                if (chars2[i] > chars2[j]) {
                    char temp = chars2[i];
                    chars2[i] = chars2[j];
                    chars2[j] = temp;
                }
            }
        }
        
        boolean isAnagram = true;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                isAnagram = false;
                break;
            }
        }
        
        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
    }
}
