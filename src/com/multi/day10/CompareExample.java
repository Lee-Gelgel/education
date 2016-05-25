package com.multi.day10;

import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Car c1 = new Car("¿¡Äí½º",8000);
		Car c2 = new Car("BMW",6000);
		int result = Objects.compare(c1, c2, new CarComparator());
		switch(result){
		case 1: System.out.println("c1 ºñ½Ó"); break;
		case 0: System.out.println("°¡°Ý°°´Ù"); break;
		case -1: System.out.println("c2 ºñ½Ó"); break;
		}
		
		
//		Integer a = 10;
//		Integer b = 20;
//		Integer c = 30;
//		System.out.println(a.compareTo(b));
//		System.out.println(c.compareTo(b));
//		System.out.println(c.compareTo(c));
		
	}
}
