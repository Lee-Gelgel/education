package com.multi.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;

class Student implements Serializable {
	private String name;
	private String major;
	private int age;

	public Student(String name, String major, int age) {
		super();
		this.name = name;
		this.major = major;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", age=" + age + "]";
	}

}

public class StudentTest {

	public static Vector<Student> getData(String fileName) {
		Vector<Student> list = new Vector<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String str;
			for (int i = 0; (str = br.readLine()) != null; i++) {
				String[] arrStr = str.split("-");
				Student student = new Student(arrStr[0], arrStr[1], Integer.parseInt(arrStr[2]));
				list.add(student);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return list;
	}

	public static void printData(Vector<Student> list) {
		for (Student student : list) {
			System.out.println(student);
		}
	}

	public static void writeData(Vector<Student> list) {
		String fileName = "src/com/multi/day15/student_backup.txt";
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(fileName));
			
			for (int i = 0; i < list.size(); i++) {
				String result = "";
				Student student = list.get(i);
				result = student.getName()+"-"+student.getMajor()+"-"+student.getAge();
				bw.write(result);
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		String fileName = "src/com/multi/day15/student.txt";
		// 파일열어서 정보 읽기
		Vector<Student> list = getData(fileName);
		// 정보출력
		printData(list);
		// 정보입력
		writeData(list);
	}
}
