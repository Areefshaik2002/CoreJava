package forLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // try-with-resources
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            int rev = 0;
            int rem;
            for (; n != 0; n /= 10) {
                rem = n % 10;
                rev = rev * 10 + rem;
            }
            System.out.println(rev);
        } // no need to explicitly close the Scanner
    }
}
