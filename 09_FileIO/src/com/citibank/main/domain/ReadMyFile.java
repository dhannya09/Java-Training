package com.citibank.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadMyFile {
	private String path="C:\\Java_Training\\Test.txt";
	private InputStream inputStream;
	private byte[] data = new byte[100];
	private int arrayLen;
	
	public void readFile() {
		try {
			File file = new File(path);
			arrayLen = (int) file.length(); //as length is long and we want int so we are typecasting to int
			data = new byte[arrayLen];
			
			inputStream = new FileInputStream(path); //this statement opens the file as well as polymorphism
			inputStream.read(data);
			for (byte b : data) {
				System.out.print((char)b);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("Error in reading file");
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("Failed to close file");
			}
		}
	}
	
}
