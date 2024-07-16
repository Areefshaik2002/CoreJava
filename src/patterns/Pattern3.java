package patterns;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			if(i%2==0) {
				for(int j=5;j>=1;j--) {
					System.out.print(j+" ");
				}
				}
				else {
					for(int j=1;j<=5;j++) {
						System.out.print(j+" ");
					}
				}
				System.out.println();
			}
		}
	}



