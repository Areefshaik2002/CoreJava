package practice;

//import java.util.Set;
//import java.util.HashSet;
public class CountVowelsCosonant{
    public static int[] CountVowelsCosonants(String s){
       int vowels = s.toLowerCase().replaceAll("[^aeiou]", "").length();
       int consonants  = s.toLowerCase().replaceAll("[^a-z]", "").length()-vowels;
        return new int[] {vowels, consonants};
        
    }
    public static void main(String[] args){
        String s = "CodingManics";
        int[] counts = CountVowelsCosonants(s);
        System.out.println("vowels: "+counts[0]+" && Consonants: "+counts[1]);
    }
}