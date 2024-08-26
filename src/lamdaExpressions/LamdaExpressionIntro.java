package lamdaExpressions;
@FunctionalInterface
interface I1{
	void m1();
	}
@FunctionalInterface
interface I2{
	void m2();
}
public class LamdaExpressionIntro {
	public static void main(String[] args) {
		I1 i1 = () ->{
			System.out.println("Lamda Expression");
		};
		I2 i2 = () ->{
			System.out.println("Another One");
		};
		i1.m1();
		i2.m2();
	}
}
