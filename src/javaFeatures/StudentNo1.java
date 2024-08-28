package javaFeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentNo1 {
	private String name;
	private int batch;
	private int number;
	public StudentNo1(String name, int batch, int number) {
		this.name = name;
		this.batch = batch;
		this.number = number;
	}
	public String setName(String name) {
		return name;
		}
	public String getName() {
		return name;
		}
	public int setbatch(int batch) {
		return batch;
		}
	public int getbatch() {
		return batch;
		}
	public int setNumber(int number) {
		return number;
		}
	public int setNumber() {
		return number;
		}
	@Override
	public String toString(){
		return ("name:"+this.name+" batch:"+this.batch+" number:"+this.number);
	}
	public static void main(String[] args) {
		List<StudentNo1> list = new ArrayList<StudentNo1>();
		list.add(new StudentNo1("Areef",123,11));
		list.add(new StudentNo1("Narendra",456,12));
		Stream<StudentNo1> s = list.stream();
		List<StudentNo1>  s1 = s.filter(stu->stu.getbatch() > 100).sorted(Comparator
				.comparing(StudentNo1::getName)).collect(Collectors.toList());
		System.out.println(s1);
		
		
	}
}
