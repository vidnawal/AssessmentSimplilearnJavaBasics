package operations;

import java.io.FileOutputStream;
import java.util.Scanner;

public class AddFiles {
	public String addFiles() {
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print(
					"Enter the file name with specific location (Format - C:\\Users\\vidnawal\\Assessment\\Vidhika.txt): ");
			String name = sc.nextLine();
			FileOutputStream fos = new FileOutputStream(name, true);
			System.out.print("Enter file content: ");
			String str = sc.nextLine() + "\n";
			byte[] b = str.getBytes();
			fos.write(b);
			fos.close();
			return "The file has been saved on the given path.";
		} catch (Exception e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
			return "Exception Occurred";
		}
	}
}
