package com.multi.day07;

public class Ex7 {
	public static void main(String[] args) {
		ExSnowTire snowTire = new ExSnowTire();
		ExTire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}
}
