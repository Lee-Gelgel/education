package com.multi.day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return studentNum == student.studentNum;
		}

		return false;
	}

	@Override
	public int hashCode() {
		String num = ""+studentNum;
		return num.hashCode();
	}

}

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(3, "gelgel"));
		set.add(new Student(3, "lulu"));
		set.add(new Student(1, "���ο�"));

		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);

		}
	}
}
