package com.multi.day08;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "turn on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "turn off");
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
