package strings;

public class StringMoreMethods {
public static void main(String[] args) {
	StringBuilder s = new StringBuilder("Java");
	System.out.println(s.insert(4, 'c'));
	System.out.println(s.append(" Developer"));
	System.out.println(s.deleteCharAt(4));
	System.out.println(s.delete(0, 5));
	System.out.println(s.hashCode());
}
}
