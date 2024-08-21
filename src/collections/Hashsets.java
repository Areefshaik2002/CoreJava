package collections;

import java.util.Iterator;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashsets {
public static void main(String[] args) {
//Set<String> s = new HashSet<String>();//Sorts according to equals() and hashcode()
//	Set<String> s = new LinkedHashSet<String>();//Insertion Order
	Set<String> s = new TreeSet<String>();//Natural sorting order
	s.add("java");
	s.add("angular");
	s.add("react");
	s.add("python");
	s.add("c");
	s.add("c++");
	Iterator<String> i = s.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
//	for(Object o: s) {
//		System.out.println(o);
//	}
	
}
}
