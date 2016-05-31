//package com.multi.day14;
//
//import java.util.TreeSet;
//
//class Student implements Comparable<Student>{
//	public String id;
//	public int score;
//	
//	
//	public Student(String id, int score) {
//		super();
//		this.id = id;
//		this.score = score;
//	}
//
//
//	@Override
//	public int compareTo(Student o) {
//		if(score > o.score) return 1;
//		if(score < o.score) return -1;
//		
//		return 0;
//	}
//
//}
//
//public class TreeSetExample4 {
//	public static void main(String[] args) {
//		TreeSet<Student> treeSet = new TreeSet<>();
//		treeSet.add(new Student("blue", 96));
//		treeSet.add(new Student("hong", 86));
//		treeSet.add(new Student("white", 92));
//		
//		Student student = treeSet.last();
//		System.out.println("최고점수: "+student.score);
//		System.out.println("최고점수를 받은 아이디: "+student.id);
//	}
//}
