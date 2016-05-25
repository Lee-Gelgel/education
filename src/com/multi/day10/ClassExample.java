package com.multi.day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car("����", 7600);
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
				System.out.println("�Լ��̸� : "+m.getName());
				System.out.println("����Ÿ�� : "+m.getReturnType());
			}
			
			// p493 ��������
			Car obj =(Car)c.newInstance();
			obj.print();
			
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
