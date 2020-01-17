import java.io.File;

public class Program2 {
	public static void main(String[] args) {

//		File myFile = new File("/home/somanna/Desktop/iodemos/first");
		File myFile = new File("/home/somanna/Desktop/iodemos/","second");

		if (myFile.mkdir()) {
			System.out.println("Directory created");
		} else {
			System.out.println("Directory already exist");
		}

	}
}
