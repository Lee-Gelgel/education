package com.multi.day10;

public class CellPhone {
	String model;
	double battery;

	public CellPhone(String model) {
		super();
		this.model = model;
	}

	void call(int time) {
		// RuntimeException ������ �ô� Exception �߻��� �����ϰ� Runtime�� �˻��Ѵ�.
		// Exception ������ �������͵� Exception ó���� �˻��Ѵ�.
		// http://hyeonstorage.tistory.com/199
		if (time < 0)
			throw new IllegalArgumentException("��ȭ�ð��Է¿���"); // IllegalArgumentException
															// :
															// RuntimeException��
															// ����
		battery -= time * 0.5;
		if (battery < 0)
			battery = 0;
		System.out.println("��ȭ �ð� : " + time + "��");
	}

	void printBattery() {
		System.out.println("���� ���͸� �� : " + battery);
	}

	void charge(int time) {
		if (time < 0)
			throw new IllegalArgumentException("�����ð��Է¿���");
		battery += time * 3;
		if (battery > 100)
			battery = 100;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof CellPhone && model.equals(((CellPhone) obj).model);
	}

}

/*
 * String model // �ڵ��� �� ��ȣ double battery; // ���� ���͸� �� CellPhone(String model)
 * // �� ��ȣ�� ���ڷ� �޴� ������ void call(int time) // ��ȭ �ð�(��)�� ����ϰ�, ��ȭ �ð��� ���� ���͸� ����
 * ���ҽ�Ų��. // ���ҵǴ� ���͸� �� = ��ȭ�ð�(��) * 0.5 // ���͸� ���� 0���� �۾����� �ʴ´�. // ��ȭ �ð�(��)�� 0����
 * ���� ��쿡�� IllegalArgumentException(����ȭ�ð��Է¿�����)�� �߻���Ų��. void charge(int time) //
 * ������ �ð�(��)�� ����ϰ�, ������ �ð��� ���� ���͸� ���� ������Ų��. // �����Ǵ� ���͸� �� = �����ð�(��) * 3 // ���͸�
 * ���� 100������ �����Ѵ�. // ���� �ð�(��)�� 0���� ���� ��쿡��
 * IllegalArgumentException(�������ð��Է¿�����)�� �߻���Ų��. void printBattery() // ���� ���͸� ����
 * ����Ѵ�. boolean equals(Object otherObject) // Object Ÿ���� ��ü�� �Է¹ް�, �Է¹���
 * ��ü��CellPhone Ÿ���� Ŭ�����̸鼭 �� ��ȣ�� ���� ��쿡 true�� �����Ѵ�.
 */
