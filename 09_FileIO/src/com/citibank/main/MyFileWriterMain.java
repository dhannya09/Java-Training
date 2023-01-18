package com.citibank.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


import com.citibank.main.domain.MyFileWriter;

public class MyFileWriterMain {

	public static void main(String[] args) {
		
		Writer fileWriter = null;
		MyFileWriter myFileWriter = null;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the path where the file has to be created");
		String path = scanner.next();
		scanner.nextLine();
		System.out.println("Please enter the message");
		String data = scanner.nextLine();
		
		File file = new File(path);
		try {
			fileWriter = new FileWriter(path);
			
			myFileWriter = new MyFileWriter(fileWriter, data);
			
			if(myFileWriter.writeFile()) {
				System.out.println("Please check your file");
			}else {
				System.out.println("Failed to write file");
			}
		} catch (IOException e) {
			System.out.println("File not found");
		}finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error closing the fileWRiter");
			}
		}
		
	}
}


