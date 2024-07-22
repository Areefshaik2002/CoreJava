package oops;

public class Initializers {
		static int i;
		int j;
		//static block
		static {
			i=10;
			System.out.println(i);
		}
		//non-static block
		{
			j=20;
			System.out.println(j);
		}
		//constructor
		public Initializers(int j) {
			this.j=j;
			System.out.println(100);
		}
		//method
		public static void m1() {
			System.out.println("Hii");
		}
	public static void main(String[] args) {
		Initializers obj1 = new Initializers(30);
		Initializers obj2 = new Initializers(40);
		Initializers.m1();
		obj1.getClass();
		obj2.getClass();
	}

}
