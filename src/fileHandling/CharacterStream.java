package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/Dell/OneDrive - Vasireddy Venkatadri Institute of Technology/Documents/SQL/Codegnan rey baba.txt");
		FileWriter fw = new FileWriter(f); 
		if (f.canWrite()) {
			fw.write("DO IT OR DIE TRYING");
		}
		else {
			System.out.println("We cannot write into the file");
		}
		fw.close();
		
		
		
//		File f = new File("C://Users//Dell//OneDrive - Vasireddy Venkatadri Institute of Technology//Documents//SQL//FileHandling.txt/");
//		System.out.println(f.canRead());
//		System.out.println(f.mkdir());
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.createNewFile());
//		File f1 = new File("C://Users//Dell//OneDrive - Vasireddy Venkatadri Institute of Technology//Documents//SQL//FileHandling.txt/");
//		f.renameTo(f1);
//		System.out.println(f.canWrite());
//		
		
	}
}
