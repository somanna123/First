import java.io.File;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) {
		
		File file = new File("/home/somanna/Desktop/iodemos/a.txt");
		
		System.out.println(file.exists());
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath());
				
	}

}
