package com.multi.test.prob4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class FileSearcher {
	public static void main(String[] args) throws IOException {
		// 구현하시오.
		Vector<String> vector = printFileList(".txt");
		for (String result : vector) {
			System.out.println(result);
		}
	}

	private static Vector<String> printFileList(String extension) throws IOException {
		// 구현하시오.
		Vector<String> vector = new Vector<>();
		String fileName = "src/com/multi/test/prob4/logFiles.txt";
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String data;
		while ((data = br.readLine()) != null) {
			String[] dataSplit = data.split("[.]");
			if (("." + dataSplit[1]).equals(extension)) {
				vector.add(data);
			}
		}
		br.close();
		return vector;
	}
}
