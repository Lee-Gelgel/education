package com.multi.day01;

//dos>java VariableTest
public class VariableTest {
	public static void main(String[] args) {
		System.out.println("Variable practice");
		//����=>�� �����
		//1.��������
		int score = 50;
		//2.�����ʱ�ȭ(�Ҵ�)
		score += 100;
		//3.�������
		System.out.println("������ " + score);

		
		//�ڹ��� �⺻�� Ÿ��
		//1.char -> ���Ϲ��ڿ� ' '
		//String =>" ",�⺻���ƴ�
		char c = 'A';//c������ 'A'���ڰ��� �����Ѵ�.
		//2byteũ��
		System.out.println(c);//c������ ����� ���� �б�
		c++;
		System.out.println(c);
		//2.boolean -> true, false
		boolean b = false;
		System.out.println(b);
		
		//3. ���� -> byte(1byte), short(2byte), int(4byte), long(8byte)
		//4. �Ǽ� -> 							float(4byte), double(8byte)
		byte by = 127;
		by++;
		by++;
		by++;
		System.out.println(by);
		
		short s = 32767;
		s++;
		System.out.println(s);
		
		//4byte ...... ���� literal�� �⺻�� int
		int i = 2147483647;
		i++;
		System.out.println(i);
		
		//8byte
		long aa = 2147483648L; //L, l ��ΰ���
		aa++;
		System.out.println(aa);
		
		//float(4byte)
		float f = 3.14F; // F, f ��ΰ���
		f++;
		System.out.println(f);
		
		//double(8byte) ...... �Ǽ��� literal�� �⺻�� double
		double d = 3.14;
		d++;
		System.out.println(d);
	}
}
