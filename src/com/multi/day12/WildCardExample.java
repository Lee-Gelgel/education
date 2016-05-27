package com.multi.day12;

import java.util.Arrays;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

class Worker extends Person {
	String job;

	public Worker(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}

	@Override
	public String toString() {
		return "Worker [job=" + job + ", name=" + name + ", age=" + age + "]";
	}

}

class Student extends Person {
	String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}

}

class HighStudent extends Student {
	int grade;

	public HighStudent(String name, int age, String major, int grade) {
		super(name, age, major);
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "HighStudent [grade=" + grade + ", major=" + major + ", name=" + name + ", age=" + age + "]";
	}

}

class MidStudent extends Student {
	int grade;

	public MidStudent(String name, int age, String major) {
		super(name, age, major);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MidStudent [grade=" + grade + ", major=" + major + ", name=" + name + ", age=" + age + "]";
	}

}

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course ) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인", 5);
		personCourse.add(new Person("gelgel", 27));
		personCourse.add(new Person("lulu", 29));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인", 5);
		workerCourse.add(new Worker("simon", 27, "개발자"));
		workerCourse.add(new Worker("jhon", 49, "선생님"));
		
		Course<Student> studnetCourse = new Course<Student>("학생", 5);
		studnetCourse.add(new Student("donald", 24, "컴공"));
		studnetCourse.add(new Student("gelgel", 24, "컴공"));
		registerCourse(personCourse);
		registerCourseWorker(workerCourse);
		registerCourseWorker(personCourse);
		
		registerCourseStudent(studnetCourse);

		System.out.println("끝");
	}
	
	
}
