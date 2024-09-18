package dsa;

public class LinearSearch {
	public static void main(String[] args) {
		/*Linear Search - iterate through a collection, one element at a time.
		 * O(n) notation
		 * it works on both sorted and non sorted but it best preferred for unsorted 
		 * like linkedList. 
		 */
		
		int[] array = {31,22 ,13 ,5 ,77, 29, 54, 73, 17, 25 };
		int index = linearSearch(array,54);
		if(index != 0) {
			System.out.println("Element found at index : "+index);
		}else {
			System.out.println("Element not found");
		}
		
		
	}
	private static int linearSearch(int[] array, int n) {
		for(int i = 0;i<array.length;i++) {
			if(array[i] == n) {
				return i;
			}
		}
		return 0;
	}
	
}
