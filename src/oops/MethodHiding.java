package oops;
class D{
	public static void m1() {
		System.out.println("D class m1() ");
	}
}
class E extends D{
	public static void m1() {
		System.out.println("E class m1()");
	}
}
public class MethodHiding {
public static void main(String[] args) {
//	E e = new E();
//	D d = new E();
	D.m1();
}
}
