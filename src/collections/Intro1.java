package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Intro1 {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	List list = new ArrayList<Comparable>();
	list.add(10);
	list.add(20);
	list.add("STRING");
	list.add(true);
	list.add(2.5);
	System.out.println(list);
	System.out.println();
	for(Object i : list) {
		System.out.println(i);
	}
	System.out.println();
	Iterator obj =list.iterator();
	while(obj.hasNext())
	{
		System.out.print(obj.next()+" ");
	}
}
}
