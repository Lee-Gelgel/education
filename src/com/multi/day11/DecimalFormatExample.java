package com.multi.day11;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("\u00A4###,###,##0");
		int num = 500000000;
		System.out.println(df.format(num));
		
		String name = "gelgel";
		String tel = "010-1234-1234";
		int age = 20;
		
		System.out.println("�̸��� "+name+" ��ȭ�� "+tel);
		System.out.printf("�̸��� %s ��ȭ�� %s",name,tel);
		String message = "�̸��� {0} \n ��ȭ�� {1} \n ���̴� {2}";
		System.out.println();
		String result = MessageFormat.format(message, name,tel,age);
		System.out.println(result);
	}

}
