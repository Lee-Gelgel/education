package com.multi.day07;

public class ChildExample {
	public static void main(String[] args) {
		Parent p = new Child();
		p.field = "부모에서 선언한 변수";
		p.method1();
		p.method2();

		if (p instanceof Child) {
			Child c = (Child) p;
			c.field2 = "자식에서 선언한 변수";
			c.method3();
		}
		// ((Child) p).field2 = "자식에서 선언한 변수";
		// ((Child) p).method3();
	}
}
