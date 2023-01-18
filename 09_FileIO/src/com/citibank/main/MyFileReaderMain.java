package com.citibank.main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;

public class MyFileReaderMain {

	public static void main(String[] args) {
		
		System.out.println("Main start");

		Scanner scanner = new Scanner(System.in);
		
//		String path = "C:\\Java_Training\\Demo.txt";
		System.out.println("Enter your file path");
		String path = scanner.next();
		
		Reader reader = null;
		MyFileReader myFileReader = null;
		BufferedReader bufferedReader = null;
		
		File file = new File(path);
		
		try {
			reader = new FileReader(file);
			bufferedReader = new BufferedReader(reader);
			myFileReader = new MyFileReader(bufferedReader);
			
			String data = myFileReader.readFileLineByLine();
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			System.out.println("Error while opening the file");
		}finally {
			
				try {
					reader.close();
					bufferedReader.close();
					
				} catch (IOException e) {
					System.out.println("Error closing");
				}
				
			
		}
		
		
//		try {
//			 reader = new FileReader(path);
//			
//			 myFileReader = new MyFileReader(file, reader);
//			 String data = myFileReader.readFile();
//			 if(data.equals("")) {
//				 System.out.println("Failed to read file");
//			 }else {
//				 System.out.println(data);
//			 }
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found");
//		}finally {
//			try {
//				reader.close();
//			} catch (IOException e) {
//				System.out.println("Error closing Reader");
//			}
//		}

	}

}
