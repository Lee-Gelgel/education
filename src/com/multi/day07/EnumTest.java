package com.multi.day07;

import java.util.Scanner;

public class EnumTest {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Month >>");
		 int month = sc.nextInt();
		
		Season season = Season.SPIRNG;
		System.out.println(season.getSeason());
		// switch(season){
		// case SPIRNG:
		// System.out.println(season.getSeason()); break;
		// case SUMMER:
		// System.out.println(season.getSeason()); break;
		// case FALL:
		// System.out.println(season.getSeason()); break;
		// case WINTER:
		// System.out.println(season.getSeason()); break;
		// }
	}
}
