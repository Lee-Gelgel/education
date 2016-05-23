package com.multi.day03;

enum Week{
	MONDAY,
	TUESDAY,
	WEDNESDAY;
	
}

enum Subject{
	JAVA, JSP, JDBC, SPRING, ANDROID, UXUI, ORACLE,
	MYBATIS, HTML5, CSS3, JAVASCRIPT, NODE, JQUERY,
	JQUERYMOBILE;
}

public class EnumTest {
	public static void main(String[] args) {
		Week a = Week.MONDAY;
		switch(a){
		case MONDAY:
			System.out.println("������");break;
		case TUESDAY:
			System.out.println("ȭ����");break;
		case WEDNESDAY:
			System.out.println("������");
		}
		
		Subject aa = Subject.valueOf("CSS3");
		System.out.println("����� ���ڿ��� �˰�������:"+aa);
		
		//����Ÿ�Կ��� ����
		int result = aa.ordinal();
		System.out.println("CSS3�� ordinal => "+result);
		
		//���� ����
		result = aa.compareTo(Subject.ANDROID);
		System.out.println("�� : "+result);
		
		//����Ÿ�� ��ü
		Subject[] study = Subject.values();
		for(Subject s : study){
			System.out.println(s);
		}
	}
}
