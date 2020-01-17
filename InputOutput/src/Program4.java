import java.io.File;

public class Program4 {
	public static void main(String[] args) {

		String path = "/home/somanna/Desktop/iodemos";
		File outerDirectory = new File(path);
		String[] files = outerDirectory.list();

		int fileCount = 0, directoryCount = 0;
		for (String file : files) {
			File tempFile = new File(outerDirectory, file);
			if (tempFile.isFile()) {
				++fileCount;
			} else {
				++directoryCount;
			}
		}
		
		System.out.println("Files = " + fileCount);
		System.out.println("Directorys = " + directoryCount);

	}
}
