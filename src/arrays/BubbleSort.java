package arrays;

public class BubbleSort {
	public void bubbleSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
public static void main(String[] args) {
	int []a = {120, 50, 30, 20, 10, 60};
	BubbleSort b = new BubbleSort();
	b.bubbleSort(a);
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
}
}
