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
			System.out.println("outerVar : " + outerVar); // OuterClass�� filed
															// ��밡��
			System.out.println("innerVar : " + innerVar);
			outerMethod(); // OuterClass�� Method ȣ�Ⱑ��
		}

		void print2() {
			print(); // ���� Class�� Method ȣ�Ⱑ��
		}
	}

	// 2.static inner class
	static class StaticInnerClass {
		int var = 300;
		static int staticVar = 400;

		void print3() {
			System.out.println("StaticInnerClass Print3 Method");
			System.out.println("var : " + var);
			System.out.println("staticOuterVaer : " + staticOuterVaer); // ��밡��
			// System.out.println("outerVaer : "+ outerVaer); //���Ұ�, class�� static�̿��� static�ƴѰ��� ���Ұ�
			System.out.println("staticVar : " + staticVar); // print3 Method�� ���� �� ����ϴ� ���̱� ������ static ��밡��
		}

		static void print4() {
			System.out.println("StaticInnerClass Print4 Method");
			// System.out.println("var : "+var); // static �ȿ��� static�� ��밡��
			System.out.println("staticVar : " + staticVar);
		}
	}

	public static void main(String[] args) {
		int localVar = 600;
		// localVar = 700; // localClass���� ������ ����Ϸ��� ��������Ѵ�, final(����) , �� ����Ұ�
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
