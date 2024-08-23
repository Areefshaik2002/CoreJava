package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


@SuppressWarnings("serial")
class Student implements Serializable{
	String name;
	long id;
	int age;
	Student(String name, long id, int age){
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ",id="+ id + ",age=" + age + "]";
	}
}
public class Serialization {
	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("C://Users//Dell//OneDrive - Vasireddy Venkatadri Institute of Technology//Documents//SQL//Codegnan rey baba.txt/");
		ObjectOutputStream obj = new ObjectOutputStream(f);
		Student s = new Student("Areef", 920966961, 21);
		obj.writeObject(s);
		obj.close();
		
	}
}
