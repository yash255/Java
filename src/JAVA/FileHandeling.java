package JAVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Code to create new file
		File myFile = new File("test.txt");
		try {
			myFile.createNewFile();
			System.out.println("file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("unable to create this file");
		}
//		
		
		//Code to write to a file
		try {
			FileWriter fileWriter = new FileWriter("test.txt");
			fileWriter.write("this my first file");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Read a File
//		File myFile = new File("test.txt");
		try {
			Scanner scanner = new Scanner(myFile);
			
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
				
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Delete File
		//File myFile = new File("test.txt");
		if(myFile.delete()) {
			System.out.println("File deleted" + myFile.getName());
		}
		else {
			System.out.println("Some error occured");
		}

	}

}
