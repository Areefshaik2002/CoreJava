package practice;

import java.util.Scanner;

public class CharToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = sc.nextLine();
        if (input.length() == 1) {
            char letter = input.charAt(0);
            if (letter >= 'a' && letter <= 'z') {
                letter -= ('a' - 'A');
            }
            if (letter >= 'A' && letter <= 'Z') {
                int position = letter - 'A' + 1;
                System.out.println("Position in alphabet: " + position);
            } else {
                System.out.println("The character is not a letter.");
            }
        } else {
            System.out.println("Please enter exactly one character.");
        }
        sc.close();
    }
}
