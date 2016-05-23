package com.multi.day03;

public class Car {
	//1.멤버변수..특징
	String model;
	String color;
	int year;
	
	//2.생성자
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


	//3.메서드
	public void move() {
		System.out.println(year+"년식 "+color+"색 "+model+"모델 자동차가 움직인다");
		System.out.println("-------------------------------------");
	}
}
