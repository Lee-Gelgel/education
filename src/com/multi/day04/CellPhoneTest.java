package com.multi.day04;

public class CellPhoneTest {
	public static void main(String[] args) {
		CellPhone[] phones = new CellPhone[5];
		phones[0] = new CellPhone("iPhon6", 80, 800, "apple", true);
		phones[1] = new CellPhone("iPhon5", 60, 700, "apple", true);
		phones[2] = new CellPhone("iPhon4", 40, 600, "apple", false);
		phones[3] = new CellPhone("iPhon3", 20, 500, "apple", false);
		phones[4] = new CellPhone("iPhon2", 10, 400, "apple", false);
		
		for(CellPhone cp : phones){
			cp.print();
		}
	}

}
