package oops;
class Animal{
	public Animal getAnimal() {
		System.out.println(this.getClass());
		return this;
	}
}
class Dog extends Animal{
	@Override
	public Dog getAnimal() {
		System.out.println(this.getClass());
		return this;
	}
}
public class Co_ContraVariant {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.getAnimal();
	}

}
