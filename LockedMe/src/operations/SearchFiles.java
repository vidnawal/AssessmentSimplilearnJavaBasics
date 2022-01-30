package operations;

import java.util.Scanner;
import java.io.File;

public class SearchFiles {

	public String searchFiles() {
		String result = "";
		String filelocation = null;
		String filename = null;

		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

			System.out.print("Enter the File location to Search (Format - C:\\Users\\vidnawal\\Assessment): ");
			filelocation = scan.nextLine();

			File directory = new File(filelocation);
			String[] flist = directory.list();

			@SuppressWarnings("resource")
			Scanner scan1 = new Scanner(System.in);

			System.out.print("Enter the Name of File");
			filename = scan1.nextLine();
			System.out.println("File to be searched" + filename);

			int flag = 0;

			if (flist == null) {
				return "Empty directory.";
			} else {

				// Linear search in the array
				for (int i = 0; i < flist.length; i++) {
					String filenames = flist[i];
					// System.out.println("Files in directory" + filenames);
					if (filenames.equalsIgnoreCase(filename)) {
						System.out.println(filenames + " found");
						flag = 1;
					}
				}
			}

			if (flag == 0) {
				System.out.println("File Not Found");
			}

		} catch (Exception e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
		return filelocation + "\\" + filename;
	}
}
