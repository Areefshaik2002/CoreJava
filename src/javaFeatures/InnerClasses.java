package javaFeatures;
class D1{
	public void m1() {
		System.out.println("D1 class");
	}
	class D2{
		public void m2() {
			System.out.println("D2 class");
		}
		class D3{
			class D4{
				public void m4() {
					System.out.println("D4 class");
				}
			}
		}
	}
}
public class InnerClasses {
	public static void main(String[] args) {
		D1 d1 = new D1();
		d1.m1();
		D1.D2 d2 = d1.new D2();
		d2.m2();
		D1.D2.D3 d3 = d2.new D3();
		D1.D2.D3.D4 d4 = d3.new D4();
		d4.m4();
		new D1().new D2().new D3().new D4().m4();
	}
}
