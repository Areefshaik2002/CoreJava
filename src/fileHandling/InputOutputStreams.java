package fileHandling;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStream;

public class InputOutputStreams {
	public static void main(String[] args) throws IOException  {
		FileOutputStream i = new FileOutputStream("C:/Users/Dell/OneDrive - Vasireddy Venkatadri Institute of Technology/Documents/SQL/Codegnan rey baba.txt",true);
		String s = " are the best";
		byte[] b = s.getBytes();
		i.write(b);
		
		
		i.close();
	}
}
