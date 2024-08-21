package collections;

import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
//		Queue<String> q = new ArrayDeque<String>();
//		q.add("Java");
//		q.add("Python");
//		q.add("SQL");
//		q.add("C++");
//		q.add("c");
//		System.out.println(q);
		
		
//		Priority Queue
//		PriorityQueue<String> q2 = new PriorityQueue<String>();
//		q2.add("Gaming");
//		q2.add("Software development");
//		q2.add("Software Engineering");
//		q2.add("Security Engineer");
//		q2.add("Network Engineer");
//		while(!q2.isEmpty()) {
//			System.out.println(q2.poll());
//		}
		
		
//		Dequeue
		Deque<String> d = new ArrayDeque<>();
		d.addLast("Java");
		d.add("Python");
		d.add("c");
		d.add("C++");
		d.add("PHP");
		d.addFirst("Ruby");
		while(!d.isEmpty()) {
			System.out.println(d.peek ());
		}
	}

}
