package com.multi.day07;

public class ChildExample {
	public static void main(String[] args) {
		Parent p = new Child();
		p.field = "�θ𿡼� ������ ����";
		p.method1();
		p.method2();

		if (p instanceof Child) {
			Child c = (Child) p;
			c.field2 = "�ڽĿ��� ������ ����";
			c.method3();
		}
		// ((Child) p).field2 = "�ڽĿ��� ������ ����";
		// ((Child) p).method3();
	}
}
