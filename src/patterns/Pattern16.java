package patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int spaces = 0;
        int stars = 9;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                if (i == 1 || j == 1 || j == stars) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}
