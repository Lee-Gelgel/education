package com.multi.day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MemberInfoDAO {
	public static List<Car> makeCar(){
		ArrayList<Car> carList = new ArrayList<>();
		carList.add(new Car("�׷���", 5000));
		carList.add(new Car("����", 8000));
		carList.add(new Car("ī�Ϲ�", 4000));
		carList.add(new Car("�ҷ���", 3000));
		carList.add(new Car("��Ÿ��", 2800));
		carList.add(new Car("��Ÿ��", 2800));
		return carList;
	}
	
	public static List<Car> makeCar2(){
		LinkedList<Car> carList = new LinkedList<>();
		carList.add(new Car("�׷���", 5000));
		carList.add(new Car("����", 8000));
		carList.add(new Car("ī�Ϲ�", 4000));
		carList.add(new Car("�ҷ���", 3000));
		carList.add(new Car("��Ÿ��", 2800));
		carList.add(new Car("��Ÿ��", 2800));
		return carList;
	}
	
	public static List<Car> makeCar3(){
		Vector<Car> carList = new Vector<>();
		carList.add(new Car("�׷���", 5000));
		carList.add(new Car("����", 8000));
		carList.add(new Car("ī�Ϲ�", 4000));
		carList.add(new Car("�ҷ���", 3000));
		carList.add(new Car("��Ÿ��", 2800));
		carList.add(new Car("��Ÿ��", 2800));
		return carList;
	}
}
