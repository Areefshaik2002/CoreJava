package dsa;
import java.util.Stack;
public class StackExample {
//	stacks actually LIFO method which Last In First Out
//	that is the last element that is added to the stack will be the first element
//	that comes out of it.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
//		Push - Adds elements to the stack
		stack.push("Narendra");
		stack.push("Areef");
		stack.push("Dinesh");
		stack.push("Harsha");
		stack.push("Sweekar");
		System.out.println(stack);
//		peek - returns the top element in the stack
		System.out.println(stack.peek());
//		pop - removes elements from the stack
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack);
	}

	

}
