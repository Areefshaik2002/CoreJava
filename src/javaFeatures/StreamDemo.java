package javaFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> I = new ArrayList<Integer>();
		I.add(30);
		I.add(49);
		I.add(14);
		I.add(10);
		I.add(70);
		I.add(90);
		I.add(80);
		I.add(25);
		I.add(60);
		
		Stream<Integer> s= I.stream();
		List<Integer> list = s.filter(i->i%5==0).sorted().collect(Collectors.toList());
		System.out.println(list);
	}
}
