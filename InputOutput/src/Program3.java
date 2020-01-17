import java.io.File;

public class Program3 {
	public static void main(String[] args) {

		File myFile = new File("/home/somanna/Desktop/iodemos/");

		String[] files = myFile.list();

		System.out.println("Total files = "+files);
		
		
		for (String file : files) {
			System.out.println(file);
		}

	}
}
