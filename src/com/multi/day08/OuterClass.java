package com.multi.day08;

public class OuterClass {
	// 1.멤버변수=필드(field)->static, non-static
	// 5.static block
	// 2.생성자
	// 3.일반메서드->static, non-static
	// 4.innerClass

	// instance 멤버 class
	class InnerClass {
		// 1.멤버변수=필드(field)->static, non-static
		int innerVar = 100;
		// static int innerVar2 = 100; //static 사용불가
		// 2.생성자
		public InnerClass() {
			System.out.println("InnerClass 생성자");
		}

		// 3.일반메서드->static, non-static
		public void innerMethod() {
			System.out.println("InnerClass의 innerMethod");
		}
		// public static void innerMethod2(){ //static 사용불가
		// System.out.println("InnerClass의 innerMethod");
		// }

	}

	// static 멤버 class
	static class StaticInnerClass {
		// 1.멤버변수=필드(field)->static, non-static
		// 5.static block
		// 2.생성자
		// 3.일반메서드->static, non-static
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
		
		
		
		// local class...함수내의 클레스
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
