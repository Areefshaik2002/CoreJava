package patterns;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(i==1 || j==5 || j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
