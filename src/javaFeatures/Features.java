package javaFeatures;
import javaFeatures.A.B;
class A{
	class B{
		public void run() {
			System.out.println("run() method");

		}
	}
}
public class Features {
	public static void main(String[] args) {
		A a = new A();
		B b = a.new B();
		b.run();
	}
}


