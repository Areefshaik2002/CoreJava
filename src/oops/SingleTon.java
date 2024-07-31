package oops;
class Single{
	private static Single t=null;
	public static Single getInstance() {
		if(t==null) {
			return new Single();
		}
		return t;
	}
}
public class SingleTon {
public static void main(String[] args) {
	Single s  = Single.getInstance();
	Single s1 = Single.getInstance();
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s==s1);
}
}
