package com.multi.day08;

public class OuterClass {
	// 1.�������=�ʵ�(field)->static, non-static
	// 5.static block
	// 2.������
	// 3.�Ϲݸ޼���->static, non-static
	// 4.innerClass

	// instance ��� class
	class InnerClass {
		// 1.�������=�ʵ�(field)->static, non-static
		int innerVar = 100;
		// static int innerVar2 = 100; //static ���Ұ�
		// 2.������
		public InnerClass() {
			System.out.println("InnerClass ������");
		}

		// 3.�Ϲݸ޼���->static, non-static
		public void innerMethod() {
			System.out.println("InnerClass�� innerMethod");
		}
		// public static void innerMethod2(){ //static ���Ұ�
		// System.out.println("InnerClass�� innerMethod");
		// }

	}

	// static ��� class
	static class StaticInnerClass {
		// 1.�������=�ʵ�(field)->static, non-static
		// 5.static block
		// 2.������
		// 3.�Ϲݸ޼���->static, non-static
		// 4.innerClass
		
		int innerVar = 200;
		static int staticInnerVar=300;
		
		public void innerMethod(){
			System.out.println("instance method");
		}
		public static void staticInnerMethod(){
			System.out.println("staticinstance method");
		}
		
	}

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass a = outer.new InnerClass();
		System.out.println(a.innerVar);
		a.innerMethod();
		
		String name = "gelgel";
		
		
		
		// local class...�Լ����� Ŭ����
		class LocalClass {
			int localVar = 50;
			public void localMethod(){
				
				System.out.println(name+" local method");
			}
		}
		
		LocalClass local = new LocalClass();
		System.out.println(local.localVar);
		local.localMethod();
		
	}
}
