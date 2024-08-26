package javaFeatures;
@FunctionalInterface
interface D{
	void m1();
}
public class MethodReferenceDemo {
	public void run() {
		System.out.println("Hello interface");
		System.out.println("Hello java Coders");
	}
	public static void main(String[] args) {
		MethodReferenceDemo d = new MethodReferenceDemo();
			D i = d::run;
			i.m1();
		
	}
}
