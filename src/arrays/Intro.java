package arrays;
public class Intro {
	public static void main(String[] args) {
			int[] arr = {10, 20, 30, 5, 50};
			int small = arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<small) {
					small = arr[i];
				}
			}
			System.out.println(small);
	}

}
