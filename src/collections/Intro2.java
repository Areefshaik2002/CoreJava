package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Intro2 {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Areef");
	list.add("Dinesh");
	list.add("Narendra");
	list.add("Sweekar");
	list.add("Harsha");
	System.out.println(list);
	list.remove(4);
	System.out.println(list);
	list.remove(3);
	System.out.println(list);
	list.remove(2);
	System.out.println(list);
	list.remove(1);
	System.out.println(list);
	list.remove(0);
	System.out.println(list);
//	Array Sort
	Collections.sort(list);
	Iterator<String> s  = list.iterator();
	while(s.hasNext()) {
		System.out.println(s.next());
	}
}
}
