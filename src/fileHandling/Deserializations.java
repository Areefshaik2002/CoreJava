package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializations{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f = new FileInputStream("C:/Users/Dell/OneDrive - Vasireddy Venkatadri Institute of Technology/Documents/SQL/Codegnan rey baba.txt");
		ObjectInputStream obj = new ObjectInputStream(f);
		Student s = (Student)obj.readObject();
		System.out.println(s.toString());
	}
}