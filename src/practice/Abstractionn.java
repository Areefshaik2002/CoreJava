package practice;
abstract class Vehicle{
	String color ;
	abstract String Model();
	public abstract String toString();
	Vehicle(String color){
		System.out.println("The color of the vehicle is: "+ color);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
class Innova extends Vehicle{
	int price;
	
	Innova(String color,int price) {
		super(color);
		System.out.println("the price of innova is+ "+price);
		this.price = price;
	}

	@Override
	String Model() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class Abstractionn {

	public static void main(String[] args) {
		

	}

}
