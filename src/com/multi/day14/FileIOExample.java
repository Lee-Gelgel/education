package com.multi.day14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {
	public static void main(String[] args) {
		String fname = "src/com/multi/day13/view/SuccessView.java";
		// FileInputStream fi = null;
		FileReader fi = null;
		FileOutputStream fo = null;
		try {
			// fi = new FileInputStream(fname);
			fi = new FileReader(fname);
			fo = new FileOutputStream("SuccessView_backup.java");
			int i;
			while ((i = fi.read()) != -1) {
				// System.out.print((char) i);
				fo.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않는다.");
		} catch (IOException e) {
			System.out.println("IO오류");
		} finally {
			try {
				if (fi != null)
					fi.close();
					fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
