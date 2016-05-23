package com.multi.day06;

//abstract class=> 내안에 추상메서드가 있다.
//객체생성불가하다
public abstract class Shape {
	int a=10;
	int x;
	int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}


	//abstract : 정의는 있고 구현은 없다
	//추상함수이다
	//이 클래스에는 추상메서드가 있으면 이 클래스는 반드시 추상클래스이어야한다.
	//추상클래스를 상속받은 자식은 추상메서드를 구현할 의무가 있다
	abstract void draw();
}
