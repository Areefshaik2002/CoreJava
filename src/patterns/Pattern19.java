package patterns;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i==j || (i+j)==(n+1) ) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
