package com.multi.day12;

import java.util.Arrays;

public class Course<T> {
	String name;
	T[] students;

	public Course(String name, int capacity) {
		super();
		this.name = name;
		students = (T[]) new Object[capacity];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t){
		for(int i=0;i<students.length;i++){
			if(students[i] == null){
				students[i]=t;
				break;
			}
		}
	}
	
	public void setStudents(T[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", students=" + Arrays.toString(students) + "]";
	}

	
}
