package com.multi.day08;

public class Phone implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println(getClass().getSimpleName() + "������ �Ҵ�...");
	}

	@Override
	public void turnOff() {
		System.out.println(getClass().getSimpleName() + "������ ����...");
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
