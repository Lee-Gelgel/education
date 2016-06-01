package com.multi.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 자바객체를 파일로 저장하기 - 직렬화
		Student[] students = { new Student("gelgel", "com", 27), new Student("lulu", "com", 29),
				new Student("simon", "com", 27) };
		String fileName = "src/com/multi/day15/object.dat";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(students[0]);
		oos.writeObject(students[1]);
		oos.writeObject(students[2]);
		oos.close();
		fos.close();

		// 파일에서 자바객체를 읽기 - 역직렬화
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		 Student student1 = (Student) ois.readObject();
		 Student student2 = (Student) ois.readObject();
		 Student student3 = (Student) ois.readObject();
		 System.out.println(student1);
		 System.out.println(student2);
		 System.out.println(student3);

	}
}
