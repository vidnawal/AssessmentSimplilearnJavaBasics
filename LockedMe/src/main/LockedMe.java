package main;

import java.util.*;
import operations.AddFiles;
import operations.DeleteFiles;
import operations.ReadFiles;
import operations.SearchFiles;

public class LockedMe {

	public static void main(String[] args) {

		lockedMe();

	}

	public static void lockedMe() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey ! I am Vidhika Nawal and this LockedMe application");
		System.out.println("This application can help you to add/delete/search file from the file system. ");
		System.out.println("What operation would you like to perform ? ");
		System.out.println("Add");
		System.out.println("Delete");
		System.out.println("Search");
		String option = sc.next();
		System.out.println("Operation Selected :::: " + option);

		if (option.equalsIgnoreCase("Add")) {
			AddFiles add = new AddFiles();
			String result = add.addFiles();
			System.out.println(result);
		} else if (option.equalsIgnoreCase("Delete")) {
			DeleteFiles delete = new DeleteFiles();
			String result = delete.deleteFiles();
			System.out.println(result);
		} else if (option.equalsIgnoreCase("Search")) {
			SearchFiles search = new SearchFiles();
			String result = search.searchFiles();
			//System.out.println(result);
			System.out.println("Would you like to open the file and read the contents?  'Y' or 'N'");
			@SuppressWarnings("resource")
			Scanner sc2 = new Scanner(System.in);
			String YesNo2 = sc2.next();
			if (YesNo2.equalsIgnoreCase("Y")) {
				ReadFiles read = new ReadFiles();
				read.readFiles(result);
			} else if (YesNo2.equalsIgnoreCase("N")) {
				System.out.println("Thanks");
			} else {
				System.out.println("Please pass the valid input. It should be either 'Y' or 'N' ");
				lockedMe();
			}
		} else {
			System.out.println("Please pass the valid input. It should be either 'Add', 'Delete' or 'Search'");
		}

		performAgain();

	}

	public static void performAgain() {
		System.out.println("Would you like to perform any other operation?  'Y' or 'N'");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String YesNo = sc.next();
		if (YesNo.equalsIgnoreCase("Y")) {
			lockedMe();
		} else if (YesNo.equalsIgnoreCase("N")) {
			System.out.println("Application has been terminated ! Would you like to restart ? 'Y' or 'N'");
			@SuppressWarnings("resource")
			Scanner sc1 = new Scanner(System.in);
			String YesNo1 = sc1.next();
			if (YesNo1.equalsIgnoreCase("Y")) {
				lockedMe();
			} else if (YesNo1.equalsIgnoreCase("N")) {
				System.out.println("Application has been terminated ! Thanks. ");
			} else {
				System.out.println("Please pass the valid input. It should be either 'Y' or 'N' ");
				lockedMe();
			}
		} else {
			System.out.println("Please pass the valid input. It should be either 'Y' or 'N' ");
			lockedMe();
		}

	}
}
