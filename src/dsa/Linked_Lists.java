package dsa;

import java.util.LinkedList;

public class Linked_Lists {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.offer("A");
		list.offer("B");
		list.offer("C");
		list.offer("D");
		list.offer("E");
		list.offer("F");
		System.out.println(list);
		
		list.poll();
		
		
		list.addFirst("X");
		list.addLast("Y");
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		list.add(4,"G");
		System.out.println(list);
		list.remove("G");
		System.out.println(list);
		list.add(0,"A");
		System.out.println(list);
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
	}
}

