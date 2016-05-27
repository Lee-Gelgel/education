package com.multi.day12;

public class ProductTest {
	public static void main(String[] args) {
		TV kind = new TV("samsung");
		Product<TV, String> p = new Product<TV, String>(kind, "smartTV");
		System.out.println(p);
	}
}
