package com.multi.day08;

public class SmartTelevison extends Televison {

	@Override
	public void turnOn() {
		System.out.println(MAX_VALUE);
		print(); // default �Լ� ȣ��
		System.out.println("Televison ��ӹ��� " + getClass().getSimpleName());

	}

	public void show() {
		System.out.println(getClass().getSimpleName() + "���� �߰��Ǵ� �޼��� show");
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
