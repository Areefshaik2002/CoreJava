package dsa;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVSarrayList {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList  = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		long StartTime;
		long EndTime;
		long ElapsedTime;
		
		for(int i=0;i<1000000;i++) {
			linkedList.add(i);
			arrayList.add(i);
		}
		
//		Linked List
		StartTime = System.nanoTime();
		EndTime = System.nanoTime();
		ElapsedTime = EndTime - StartTime;
		linkedList.add(500000);
		System.out.println("LinkedList Took : "+ElapsedTime+" ns");
		
		
//		Array List
		StartTime = System.nanoTime();
		EndTime = System.nanoTime();
		ElapsedTime = EndTime - StartTime;
		arrayList.add(500000);
		System.out.println("ArrayList Took : "+ElapsedTime+" ns");
	}
}
