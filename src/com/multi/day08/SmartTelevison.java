package com.multi.day08;

public class SmartTelevison extends Televison {

	@Override
	public void turnOn() {
		System.out.println(MAX_VALUE);
		print(); // default 함수 호출
		System.out.println("Televison 상속받은 " + getClass().getSimpleName());

	}

	public void show() {
		System.out.println(getClass().getSimpleName() + "에서 추가되는 메서드 show");
	}

	int volum;

	@Override
	public void setVolum(int volum) {
		if (MAX_VALUE < volum) {
			volum = MAX_VALUE;
		} else if (MAX_VALUE2 > volum) {
			volum = MAX_VALUE2;
		} else {
			this.volum = volum;
		}
		System.out.println(volum);

	}

}
