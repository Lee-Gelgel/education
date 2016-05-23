package com.multi.day04;

//public 모든 패키지에서 사용가능
public class Car {
	// 1.멤버변수(특징)
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	static int carCount; // 자동차의 갯수를

	// 2.생성자 -> new시 자동으로 호출되는 함수
	// default 생성자가 제공된다 => public Car(){} //(매개변수가 없다)
	// 생성자가 추가되면 default생성자가 제거된다
	// 생성자의 Overloading가능하다
	// Overloading=>이름은 같은데 매개변수 사양이 다르다
	//this: 현재객채(new)를 의미한다
	//1)
	//2)
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String model, String color) {
		this(model, color, 120);
	}

	public Car(String model) {
		this(model, "Red", 120);
	}

	public Car() {
		this("SM7", "Red", 120);
	}

	// 3.일반함수...오버로딩이 가능하다
	public void print() {
		System.out.println(model + ", " + color + ", " + maxSpeed);
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}

	//public : 모든 패키지에서 접근가능
	public int print(int speed) {
		
		changeSpeed(speed);
		return maxSpeed;
	}
	
	//private : 이 클래스내에서만 접근이 가능하다
	private void changeSpeed(int speed){
		if(speed==0) return;
		System.out.println("Speed변경됩니다.");
		maxSpeed = maxSpeed + speed;
	}
}
