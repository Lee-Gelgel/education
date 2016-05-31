package com.multi.day14;

import java.io.File;

public class FileExample {
	public static void main(String[] args) {
		File f =new File(".");
		System.out.println(f.getAbsolutePath());
		
		File f2 = new File("src/com/multi/day14/FileExample.java");
		System.out.println(f2.getAbsolutePath());
		System.out.println(f2.length());
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());
		System.out.println(f2.canRead());
		System.out.println(f2.canWrite());
		System.out.println(f2.canExecute());
		
		System.out.println();
		File f3 = new File("src/com/multi/day14");
		System.out.println(f3.isDirectory());
		String[] files = f3.list();
		for(String s : files){
			System.out.println(s);
		}
		
		
		
		System.out.println();
		File f4 = new File("src/com/multi/day15");
		System.out.println(f4.exists());
		System.out.println(f4.mkdir());
	}
}
