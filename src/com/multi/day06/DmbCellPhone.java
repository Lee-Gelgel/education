package com.multi.day06;

public class DmbCellPhone extends CellPhone {
	// ����
	int channel;

	// ������
	public DmbCellPhone(String model, String color, int channel) {
		//super(model,color);
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	// �Լ�
	void turnOnDmb() {
		System.out.println("channel " + channel + "�� DMB ���� ����");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel " + channel + "������ �ٲ� ");
	}

	void turnOffDmb() {
		System.out.println("DMB ���� ����");
	}

}