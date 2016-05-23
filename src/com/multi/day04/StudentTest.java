package com.multi.day04;

public class StudentTest {
	public static void main(String[] args) {
		//¹è¿­»ý¼º
		Student[] students = new Student[5];
		students[0] = new Student("1601", "Gelgel", "Computer", null);
		students[1] = new Student("1602", "Lulu", "Computer", null);
		students[2] = new Student("1603", "°Ö°Ö", "Computer", null);
		students[3] = new Student("1604", "·ç·ç", "Computer", null);
		students[4] = new Student("1605", "Simon", "Computer", null);
		
		//Á¡¼öÀÔ·Â
		int[][] score = {{100, 90, 80},{100,90,80,70},{100,90},{100},{80,90,100}};
		for(int i=0;i<students.length;i++){
			students[i].setScores(score[i]);
			System.out.println(students[i]);
			//ÃÑÁ¡°è»ê
			int totalScore = students[i].totalScore();
			//ÃÑÁ¡Ãâ·Â
			System.out.println("ÃÑÁ¡ : " +totalScore);
		}
//		for(Student stu : students){
//			System.out.println(stu.toString());
//		}
//		for(int i=0;i<students.length;i++){
//			//ÃÑÁ¡°è»ê
//			int totalScore = students[i].totalScore();
//			//ÃÑÁ¡Ãâ·Â
//			System.out.println("ÃÑÁ¡ : " +totalScore);
//		}
	}
}
