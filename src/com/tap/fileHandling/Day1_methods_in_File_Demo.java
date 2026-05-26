package com.tap.fileHandling;

import java.io.File;
import java.io.IOException;

public class Day1_methods_in_File_Demo {

	public static void main(String[] args) {
		String path = "D:\\Placement\\data.txt";
		File file = new File(path);
		
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		System.out.println(file.getParent());
		System.out.println(file.getName());
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		/*
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		*/
		
//		file.mkdir();
		
		/*
		String[] myFiles = file.list();
		for( String myFile:myFiles) {
			System.out.println(myFile);
		}
		*/
		
		file.delete();
		
		System.out.println(file.getAbsolutePath());
	}

}
