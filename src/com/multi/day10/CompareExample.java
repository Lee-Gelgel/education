package com.multi.day10;

import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Car c1 = new Car("����",8000);
		Car c2 = new Car("BMW",6000);
		int result = Objects.compare(c1, c2, new CarComparator());
		switch(result){
		case 1: System.out.println("c1 ���"); break;
		case 0: System.out.println("���ݰ���"); break;
		case -1: System.out.println("c2 ���"); break;
		}
		
		
//		Integer a = 10;
//		Integer b = 20;
//		Integer c = 30;
//		System.out.println(a.compareTo(b));
//		System.out.println(c.compareTo(b));
//		System.out.println(c.compareTo(c));
		
	}
}
