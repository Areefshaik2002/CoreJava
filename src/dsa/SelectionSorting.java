package dsa;

public class SelectionSorting {

	public static void main(String[] args) {
		
		int[] array = {9,2,3,8,7,4,5,6,1,0};
		SelectionSort(array);
		for(int i: array) {
			System.out.print(i+" ");
		}

	}

	private static void SelectionSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			int min=i;
			for(int j=i+1;j<array.length-1;j++) {
				if(array[min]<array[j]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}

}
