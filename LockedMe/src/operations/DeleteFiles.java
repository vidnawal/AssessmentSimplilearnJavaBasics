package operations;

import java.io.File;
import java.util.Scanner;

public class DeleteFiles {

	public String deleteFiles() {
		try {
			String filename;
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

			System.out.print(
					"Enter the Name of File to Delete with specific location (Format - C:\\Users\\vidnawal\\Assessment\\Vidhika.txt): ");
			filename = scan.nextLine();

			File f = new File(filename);

			if (f.delete()) {
				return "File " + f.getName() + " is deleted";
			} else {
				return "Delete operation failed";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return e.toString();
		}
	}

}
