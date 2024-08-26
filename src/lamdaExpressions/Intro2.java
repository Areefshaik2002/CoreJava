package lamdaExpressions;
abstract class Demo{
	public abstract void m1();
	public abstract void m2();
	public void m3() {
		System.out.println("m3 method()");
	}
}
public class Intro2 {
	public static void main(String[] args) {
		Demo d = new Demo() {
			@Override
			public void m1() {
				System.out.println("demo m1");
			}
			@Override
			public void m2() {
				System.out.println("demo m2");
			}
		};
		d.m1();
		d.m2();
		d.m3();
		
	}
}
