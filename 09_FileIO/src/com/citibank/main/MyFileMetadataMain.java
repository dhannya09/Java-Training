package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.MyFileMetadata;
import com.citibank.main.domain.ReadMyFile;
import com.citibank.main.domain.WriteMyFile;

public class MyFileMetadataMain {
	

	public static void main(String[] args) {
		
		OutputStream outputStream = null;
		WriteMyFile writeMyFile = null;
		
		MyFileMetadata fileMetadata = new MyFileMetadata();
		fileMetadata.printFileMetadata();
		ReadMyFile readMyFile = new ReadMyFile();
		readMyFile.readFile();
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the path where the file has to be created");
		String path = scanner.next();
		scanner.nextLine();
		System.out.println("Please enter the message");
		String outMessage = scanner.nextLine();
		
		
		
		
		File file = new File(path);
		try {
			outputStream = new FileOutputStream(path,true);
			
			writeMyFile = new WriteMyFile(outputStream, outMessage);
			
			if(writeMyFile.writeFile()) {
				System.out.println("Please check your file");
			}else {
				System.out.println("Failed to write file");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				System.out.println("Failed to close file");
			}
		}		
		
	}

}
