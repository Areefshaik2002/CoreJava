package oops;
class A{
	int i;
	int j;
	A(int i, int j){
		this.i = i;
		this.j = j;
	}
	public void Printmsg() {
		int i = 10;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(j);
	}
}
class B extends A{
	B(int i, int j) {
		super(i, j);
		
	}
	int i=100;
	public void m1() {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
}
public class SuperKeyword {

	public static void main(String[] args) {
		B obj = new B(15, 30);
		obj.m1();
		obj.Printmsg();
		
	}

}
