package operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFiles {

	public void readFiles(String result) {
		try {
			File file = new File(result);
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));
			System.out.println("The file content is: ");
			int r = 0;
			while ((r = br.read()) != -1) {
				System.out.print((char) r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
