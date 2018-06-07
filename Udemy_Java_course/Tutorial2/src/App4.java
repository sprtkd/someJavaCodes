import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\supde\\Desktop\\New Text Document.txt";

		File textFile = new File(fileName);

		Scanner textIn;

		try {
			textIn = new Scanner(textFile);
			while (textIn.hasNextLine()) {
				String txtLine = textIn.nextLine();

				System.out.println(txtLine);
			}

			textIn.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
