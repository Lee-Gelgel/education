package com.multi.day08;

//interface�� �̿��ϱ����� ����class����
//����class ����ߴ�.
//����class ���������ʰ� ���? �͸�����ü
//�߻�class�� interface�� new�Ұ�
//������ �͸�����ü��������
public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("���縦 �մϴ�");
			}
		};

		action.work();
	}
}
