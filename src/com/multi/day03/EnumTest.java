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
			System.out.println("월요일");break;
		case TUESDAY:
			System.out.println("화요일");break;
		case WEDNESDAY:
			System.out.println("수요일");
		}
		
		Subject aa = Subject.valueOf("CSS3");
		System.out.println("상수의 문자열을 알고있을때:"+aa);
		
		//열거타입에서 순번
		int result = aa.ordinal();
		System.out.println("CSS3의 ordinal => "+result);
		
		//순번 차이
		result = aa.compareTo(Subject.ANDROID);
		System.out.println("비교 : "+result);
		
		//열거타입 전체
		Subject[] study = Subject.values();
		for(Subject s : study){
			System.out.println(s);
		}
	}
}
