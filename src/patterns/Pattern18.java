package patterns;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=5;
			for(int i=1;i<=5;i++) {
				if(i%2!=0) {
					int k=((i-1)*n)+1;
					for(int j=1;j<=n;j++) {
						System.out.print(k+" ");
						k++;
					}
				}
				else {
					int k=i*n;
					for(int j=1;j<=n;j++) {
						System.out.print(k+" ");
						k--;
					}
				}
				System.out.println();
			}
	}

}
