package com.multi.day06;

public class HankookTire extends Tire {
	// �ʵ�
	// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// �޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotion; // ���� ȸ���� 1����
		if (accumulatedRotion < maxRotation) {
			System.out.println(location + " HankookTire ����: "
			+ (maxRotation - accumulatedRotion) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}
