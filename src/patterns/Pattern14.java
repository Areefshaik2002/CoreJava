package patterns;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int stars =1;
		int spaces=n-1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=9;j++) {
				if(j==1 || j==stars || i==5 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
					
			}
			System.out.println();
			stars+=2;
			spaces--;
		}
	}

}
