package dsa;

public class DynamicArrays {
	int size;
	int capacity = 10;
	Object[] array;
	public DynamicArrays() {
		this.array = new Object[capacity];
	}
	public DynamicArrays(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
	}
	
}
