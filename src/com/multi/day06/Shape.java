package com.multi.day06;

//abstract class=> ���ȿ� �߻�޼��尡 �ִ�.
//��ü�����Ұ��ϴ�
public abstract class Shape {
	int a=10;
	int x;
	int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}


	//abstract : ���Ǵ� �ְ� ������ ����
	//�߻��Լ��̴�
	//�� Ŭ�������� �߻�޼��尡 ������ �� Ŭ������ �ݵ�� �߻�Ŭ�����̾���Ѵ�.
	//�߻�Ŭ������ ��ӹ��� �ڽ��� �߻�޼��带 ������ �ǹ��� �ִ�
	abstract void draw();
}
