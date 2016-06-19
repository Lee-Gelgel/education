package com.multi.test.prob3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class StudentCollection {
	public static void main(String[] args) throws Exception {
		Vector<Student> stdList = makeStudentList();
		for (int i = 0; i < stdList.size(); i++) {
			System.out.println(stdList.get(i).toString());
		}
	}

	private static Vector<Student> makeStudentList() throws Exception {
		// 구현하시오.
		Vector<Student> stdList = new Vector<>();
		String fileName = "src/com/multi/test/prob3/scores.txt";
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String data;
		while ((data = br.readLine()) != null) {
			String[] dataSplit = data.split(":");
			stdList.add(new Student(dataSplit[0], Integer.parseInt(dataSplit[1])));
		}
		br.close();
		return stdList;
	}
}
