package com.multi.day13;

import java.util.ArrayList;

class Car{
	String model;
	int price;
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
	
	
	
}

public class CollectionExample {
	
	//List interface -> ArrayList lass, LinkedList class
	public static void main(String[] args) {
		ArrayList data = new ArrayList();
		data.add(100);
		data.add(new Integer(100));
		data.add("자바 collection");
		data.add(new String("자바 collection"));
		data.add(new Car("그랜저",4000));
		System.out.println(data.size());
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		System.out.println(data.get(4));
		
		ArrayList<String> data2 = new  ArrayList<>();
		data2.add("월요일");
		data2.add("화요일");
		data2.add("수요일");
		data2.add("목요일");
		data2.add("금요일");
		data2.add("토요일");
		data2.add("일요일");
		
		System.out.println(data2.size());
		for (int i = 0; i < data2.size(); i++) {
			System.out.println(i+"=>"+data2.get(i));
		}
		for(String str : data2){
			System.out.println(str);
		}
	}
}
