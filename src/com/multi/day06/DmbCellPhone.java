package com.multi.day06;

public class DmbCellPhone extends CellPhone {
	// 변수
	int channel;

	// 생성자
	public DmbCellPhone(String model, String color, int channel) {
		//super(model,color);
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	// 함수
	void turnOnDmb() {
		System.out.println("channel " + channel + "번 DMB 수신 시작");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel " + channel + "번으로 바꿈 ");
	}

	void turnOffDmb() {
		System.out.println("DMB 수신 멈춤");
	}

}