package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("C://Users//Dell//OneDrive - Vasireddy Venkatadri Institute of Technology//Documents//SQL//Codegnan rey baba.txt/");
		int n = f.read();
		char c = (char)n;
		while(n!=-1) {
			System.out.println(c);
			n=f.read();
		}
		f.close();
	}
}
