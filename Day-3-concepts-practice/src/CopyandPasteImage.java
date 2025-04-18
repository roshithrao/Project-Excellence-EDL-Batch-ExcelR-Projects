
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyandPasteImage {
	public static void main(String[] args) {
		String inputFilePath = "C:\\Users\\HI\\Downloads\\download.png";
		String outputFilePath = "C:\\Users\\HI\\Downloads\\cop.png";

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// Create FileInputStream to read the image
			File inputFile = new File(inputFilePath);
			fis = new FileInputStream(inputFile);

			// Create FileOutputStream to write the image
			File outputFile = new File(outputFilePath);
			fos = new FileOutputStream(outputFile);

			// Buffer for reading and writing the image
			byte[] buffer = new byte[1024];
			int bytesRead;

			// Read from input file and write to output file
			while ((bytesRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}

			System.out.println("Image has been copied successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}