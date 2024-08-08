package arrays2D;

public class Transpose {
public static void main(String[] args) {
	int[][] a = {
			{1,2,3},
			{1,2,3},
			{1,2,3}
	};
	for(int i =0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
}
}
