package com.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	 	public static void main(String[] args) throws IOException {
			
	 		File file = new File("C:\\batch 2 files\\test.txt");
	 		//file.createNewFile();
	 		
			/*
			 * if(file.createNewFile()) { System.out.println("File created successfully "
			 * +file.getName()); System.out.println("at : "+ file.getAbsolutePath()); }else
			 * { System.out.println("Failed to create file"); }
			 */

	 		System.out.println("canRead() - "+file.canRead());
	 		System.out.println("canWrite "+file.canWrite());
	 		
	 		System.out.println("after setting readonly");
	 		
	 		//file.setReadOnly();
	 		file.setWritable(true);
	 		
	 		System.out.println("canRead() - "+file.canRead());
	 		System.out.println("canWrite "+file.canWrite());
	 		
	 		
	 		
		}

}
