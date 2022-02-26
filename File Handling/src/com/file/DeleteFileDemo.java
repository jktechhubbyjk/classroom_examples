package com.file;

import java.io.File;
import java.io.IOException;

public class DeleteFileDemo {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\batch 2 files\\test.txt");
		
	//	file.createNewFile();
		//file.delete();
		
		if(file.delete()) {
			System.out.println("deleted file "+file.getName());
		}else {
			System.out.println("failed to delete file : "+file.getName());
		}
		
	}

}
