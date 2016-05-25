package com.multi.day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car("에쿠스", 7600);
		System.out.println(car);

		Class<?> a = car.getClass();

		System.out.println(a.getName());
		System.out.println(a.getSimpleName());
		System.out.println(a.getPackage().getName());
		System.out.println();

		Class<?> b = new String().getClass();
		System.out.println(b.getPackage().getName());

		try {
			Class<?> c = Class.forName("com.multi.day10.Car");
			System.out.println(c.getName());
			System.out.println(c.getSimpleName());
			System.out.println(c.getPackage().getName());

			Constructor<?>[] cons = c.getDeclaredConstructors();
			for (Constructor<?> aa : cons) {
				System.out.println(aa);
			}
			
			Method[] methods = c.getDeclaredMethods();
			for(Method m : methods){
				System.out.println(m);
				System.out.println("함수이름 : "+m.getName());
				System.out.println("리턴타입 : "+m.getReturnType());
			}
			
			// p493 동적생성
			Car obj =(Car)c.newInstance();
			obj.print();
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
