package com.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\batch 2 files\\test.txt");
		
		Scanner scr = new Scanner(file);
		
		while(scr.hasNextLine()) {
			String str = scr.nextLine();
			System.out.println(str);
		}
	}

}
