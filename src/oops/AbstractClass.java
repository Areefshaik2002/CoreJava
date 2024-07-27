package oops;
abstract class A11{
	int i;
	A11(int i){
		this.i=i;
		}
	public void m1() {
		System.out.println("method1 in A class ");
	}
	abstract public void m2();
	abstract public void m3();
}
class B11 extends A11{
	int j;
	B11(int i, int j){
		super(i);
		this.j=j;
	}
	@Override
	public void m2() {
		System.out.println("method2 in B class");
	}
	@Override
	public void m3() {
		System.out.println("method3 in B class");
	}
	
}
public class AbstractClass {
	public static void main(String[] args) {
		A11 a = new B11(10,20);
		a.m1();
		a.m2();
		a.m3();
		System.out.println(a.i);
		B11 b = (B11)a;
		System.out.println(b.j);
//		b.m1();
//		b.m2();
//		b.m3();
//		System.out.println(b.i);
		
	}

}
