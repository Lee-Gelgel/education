package com.multi.day06;

public class ShapteTest {
	public static void main(String[] args) {
		
		//������ �����
		
		Rectangle s1 = new Rectangle(10, 20, 30, 40);
		Circle s2 = new Circle(60, 70, 80);
		shapeUse(s1);
		shapeUse(s2);
			
		
		//������ Ŭ����(type)�� ������
		//�Լ��� ������Ʈ(�ν��Ͻ�)�� ������
	}
	
	public static void shapeUse(Shape s){
		//������ �׸���
		s.draw();
		
	}
}
