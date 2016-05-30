package com.multi.day13;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	//Set->순서가 없다. 중복허용안함.
	//......HashSet, TreeSet, 
	public static void printHashSet(){
		HashSet<String> hs = new HashSet<>();
		hs.add("월요일");
		hs.add("화요일");
		hs.add("수요일");
		hs.add("목요일");
		hs.add("금요일");
		hs.add("토요일");
		hs.add("일요일");
		hs.add("일요일");
		System.out.println(hs);
	}
	
	public static void makeCar(){
		HashSet<Car> carList = new HashSet<>();
		carList.add(new Car("그랜저", 5000));
		carList.add(new Car("에쿠스", 8000));
		carList.add(new Car("카니발", 4000));
		carList.add(new Car("소렌토", 3000));
		carList.add(new Car("싼타페", 2800));
		carList.add(new Car("싼타페", 2800));
		
		for(Car c : carList){
			System.out.println(c);
		}
		
		System.out.println("============================");
		Iterator<Car> it = carList.iterator();
		while(it.hasNext()){
			Car car = it.next();
			System.out.println(car);
		}
	}
	
	public static void main(String[] args) {
		printHashSet();
		makeCar();
	}
}
