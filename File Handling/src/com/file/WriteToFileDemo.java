package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemo {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\batch 2 files\\test.txt");
		
		FileWriter fw = new FileWriter(file);
		
		fw.write("hi this is jk from jktechhub dfkjbfbdsxjbdjshb");
		
		fw.flush();
		
		Student sdt = new Studet();
		
		sdt.setNm("jitesh");
		sdt.setLNm("katkar");
		
		System.out.println(sdt);
		
	}

}
