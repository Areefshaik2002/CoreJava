package dsa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
//Queue is an interface, so we know we cannot instantiate an object to a interface
//	since linkedList utilize the queue interface we use LinkedList. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Queue<String> queue = new LinkedList<String>();
//		To add a element we use "offer"
//		we can also use "add" but there is a chance of throwing an exception.
			queue.offer("Narendra");
			queue.offer("Areef");
			queue.offer("Harsha");
			queue.offer("Dinesh");
			queue.offer("Sweekar");
			System.out.println(queue);
//		size() - to check the size and contains() - to check if a element exists
			System.out.println(queue.size());
			System.out.println(queue.contains("Areef"));
			
//			similar to the stack we use peek() to return the first element
			System.out.println(queue.peek());
			
//			poll() - used to remove a element from the queue
			queue.poll();
			queue.poll();
			queue.poll();
			queue.poll();
			queue.poll();
			System.out.println(queue);
			
//			isempty()  - return true if queue is empty
			System.out.println(queue.isEmpty());
	}

}
