package patterns;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int spaces=0;
			int stars =9;
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=spaces;j++) {
					System.out.print("  ");
				}
				for(int j=1;j<=stars;j++) {
					System.out.print("* ");
				}
				System.out.println();
				spaces++;
				stars-=2;

				}
	}

}
