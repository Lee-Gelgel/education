package com.multi.day09;

public class OuterClass {
	int outerVar = 100;
	static int staticOuterVaer = 500;

	void outerMethod() {
		System.out.println("outerMethod : " + outerVar);
	}

	// 1.instance inner class
	class InnerClass {
		int innerVar = 200;

		void print() {
			System.out.println("outerVar : " + outerVar); // OuterClass의 filed
															// 사용가능
			System.out.println("innerVar : " + innerVar);
			outerMethod(); // OuterClass의 Method 호출가능
		}

		void print2() {
			print(); // 같은 Class의 Method 호출가능
		}
	}

	// 2.static inner class
	static class StaticInnerClass {
		int var = 300;
		static int staticVar = 400;

		void print3() {
			System.out.println("StaticInnerClass Print3 Method");
			System.out.println("var : " + var);
			System.out.println("staticOuterVaer : " + staticOuterVaer); // 사용가능
			// System.out.println("outerVaer : "+ outerVaer); //사용불가, class가 static이여서 static아닌것은 사용불가
			System.out.println("staticVar : " + staticVar); // print3 Method는 생성 후 사용하는 것이기 때문에 static 사용가능
		}

		static void print4() {
			System.out.println("StaticInnerClass Print4 Method");
			// System.out.println("var : "+var); // static 안에는 static만 사용가능
			System.out.println("staticVar : " + staticVar);
		}
	}

	public static void main(String[] args) {
		int localVar = 600;
		// localVar = 700; // localClass에서 변수를 사용하려면 상수여야한다, final(생략) , 값 변경불가
		args[0] = "100";

		class LocalClass {
			String name = "JAVA";

			void print() {
				System.out.println("localVar : " + localVar + args[0]);
			}
		}

		LocalClass aa = new LocalClass();
		aa.print();
	}
}
