package oops;
class Mammal{
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}
class Lion extends Mammal{
	public void sound() {
		System.out.println("Lion roars");
	}
}
public class Dynamic_Binding {
public static void main(String[] args) {
	Mammal animal = new Lion();
	animal.sound();
	
}
}
