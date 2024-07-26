package oops;
class Car{
	public void drive(Car c) {
		System.out.println(this.getClass().getSimpleName()+" is running");
	}
	public void m1() {
		System.out.println("m1 method");
	}
	public void m2 () {
		System.out.println("m2 method");
	}
	public void Speed() {
		System.out.println("car is running");
	}
}
class Audi extends Car{
	@Override
	public void Speed() {
		System.out.println("Audi car is running");
	}
}
class Ferrari extends Car{
	@Override
	public void Speed() {
		System.out.println("Ferrari car is running");
	}
}
class Benz extends Car{
	@Override
	public void Speed() {
		System.out.println("Benz car is running");
	}

	
}
public class UpCasting {

	public static void main(String[] args) {
		//UpCasting
		Car car =  new Benz();
		car.drive(car);
		car.Speed();
//		DownCasting
		Benz B = (Benz)car;
		B.drive(car);
		B.m1();
		B.m2();
		B.Speed();
		
	}

}
