package arrays;

public class BinarySearch {
	public static int Binary(int a1[] ,int target) {
//		int[] a1 = {10,20,30,40,50,60};
		int left= 0; int right= a1.length-1;
		while(left<=right) {
		int mid = (left + right)/2;
		if(a1[mid] < target) {
			left = mid + 1;
			}
		else if(a1[mid] < target) {
			right = mid - 1;
		}else if(a1[mid] == target) {
			return mid;
		}
		}
		return -1;
		}
public static void main(String[] args) {
	int[] a1 = {10,20,30,40,50,60};
	System.out.println(Binary(a1, 60));
}
}
