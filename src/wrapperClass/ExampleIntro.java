package wrapperClass;

public class ExampleIntro {
public static void main(String[] args) {
	int i =10;
	System.out.println(i);
	Float f = Float.valueOf(i);
	System.out.println(f);
	Double d = Double.valueOf(f);
	System.out.println(d);
	boolean b1 = true;
	Boolean b = Boolean.valueOf(b1);
	System.out.println(b1);
	System.out.println(b);
	
	
	float f1 = 10.5f;
	Integer i1 = (int) f1;
	System.out.println(i1);
	int a = i1.intValue();//unboxing
	
	int s = 10;
	Integer i11 = s;//Autoboxing
	System.out.println(a);
	System.out.println(i11);
//		Float f11 = (float) a;
//	string to 
	String s22 = "210";
	int  i22 = Integer.parseInt(s22);
	System.out.println(i22);
	float f22 = Float.parseFloat(s22);
	System.out.println(f22);
	
	
}
}
