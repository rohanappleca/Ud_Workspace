import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {

		// Stream Connectivity
		File f = new File("C:\\UD\\Automation\\FileWriting\\FileWrite2.txt"); // For CSV use ".csv"
		FileWriter fw = new FileWriter(f, false);
		BufferedWriter writer = new BufferedWriter(fw);

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 3; j++) {
				int num = (int) (Math.random() * 100);
				writer.write(num + "\t"); // For CSV use ","
				

			}
			writer.newLine();
		}
		
		writer.close();

        //---- For writing to HTML File -----------
		// writer.write("<html><body><title>Rohan</title>Learning Java<h1></h1></body>
		// </html>");
		
	}

}
