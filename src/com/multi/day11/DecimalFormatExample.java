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
		
		System.out.println("이름은 "+name+" 전화는 "+tel);
		System.out.printf("이름은 %s 전화는 %s",name,tel);
		String message = "이름은 {0} \n 전화는 {1} \n 나이는 {2}";
		System.out.println();
		String result = MessageFormat.format(message, name,tel,age);
		System.out.println(result);
	}

}
