package com.multi.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample2 {
	public static void main(String[] args) {
		String fname = "src/com/multi/day13/view/SuccessView.java";
		String fname2 = "src/com/multi/day14/SuccessView_backup.java";
		// FileInputStream fi = null;
		// FileOutputStream fo = null;
		FileReader fi = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			// fi = new FileInputStream(fname);
			fi = new FileReader(fname);
			br = new BufferedReader(fi);
			fw = new FileWriter(fname2);
			bw = new BufferedWriter(fw);
			//int i;
			String line;
			while ((line = br.readLine())!=null) {
				// System.out.print((char) i);
				System.out.println(line);
				bw.write(line);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않는다.");
		} catch (IOException e) {
			System.out.println("IO오류");
		} finally {
			try {
				if (br != null)	br.close();
				if (bw != null)	bw.close();
				if (fi != null)	fi.close();
				if (fw != null)	fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
