package dsa;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueues {
//Priority Queue - A FIFO datastructue that implements the elements with highest 
//priority first and gradually the least priority for the last.
public static void main(String[] args) {
	Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
	queue.offer("D");
	queue.offer("E");
	queue.offer("A");
	queue.offer("C");
	queue.offer("B");
	
	while(!queue.isEmpty()) {
//isEmpty() - checks if the queue is empty and returns true if the queue is empty
		System.out.println(queue.poll());
	}
}
}
