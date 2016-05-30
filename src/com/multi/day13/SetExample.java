package com.multi.day13;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	//Set->������ ����. �ߺ�������.
	//......HashSet, TreeSet, 
	public static void printHashSet(){
		HashSet<String> hs = new HashSet<>();
		hs.add("������");
		hs.add("ȭ����");
		hs.add("������");
		hs.add("�����");
		hs.add("�ݿ���");
		hs.add("�����");
		hs.add("�Ͽ���");
		hs.add("�Ͽ���");
		System.out.println(hs);
	}
	
	public static void makeCar(){
		HashSet<Car> carList = new HashSet<>();
		carList.add(new Car("�׷���", 5000));
		carList.add(new Car("����", 8000));
		carList.add(new Car("ī�Ϲ�", 4000));
		carList.add(new Car("�ҷ���", 3000));
		carList.add(new Car("��Ÿ��", 2800));
		carList.add(new Car("��Ÿ��", 2800));
		
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
