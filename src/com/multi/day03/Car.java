package com.multi.day03;

public class Car {
	//1.�������..Ư¡
	String model;
	String color;
	int year;
	
	//2.������
	Car(){
		this("BMW","WHITE",2013);
	}
	Car(String model){
		this(model,"WHITE",2013);
	}
	Car(String model, String color){
		this(model,color,2013);
	}
	
	Car(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
	}


	//3.�޼���
	public void move() {
		System.out.println(year+"��� "+color+"�� "+model+"�� �ڵ����� �����δ�");
		System.out.println("-------------------------------------");
	}
}
