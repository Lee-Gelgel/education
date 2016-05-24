package com.multi.day09;

class Animal{
	
}
class Dog extends Animal{
	
}

class Cat extends Animal{
	
}


public class ExceptionExample {
	public static void main(String[] args) {

		try {
			// 1.연산오류
			// 컴파일 오류없음, 런타임 오류
			int a = 10;
			int b = 10;
			int c = a / b; // <--오류 (ArithmeticException)
			System.out.println(c);

			// 2.index범위오류
			// 컴파일 오류없음, 런타임 오류
			int[] arr = { 1, 2, 3, 4, 5 };
			System.out.println(arr[1]); // <--오류 (IndexOutOfBoundsException)

			// 3. 문자->숫자
			// 컴파일 오류없음, 런타임 오류
			String s = "3";
			int i = Integer.parseInt(s); // <--오류 (NumberFormatException)
			System.out.println(i);

			// 4. null 참조
			// 컴파일 오류없음, 런타임 오류
			String str = "JAVA";
			System.out.println(str.length()); // <--오류 (NullPointerException)
			
			// 5. 자동형변환 : 상위 = 하위 // 강제형변환 : 하위 = (하위) 상위 <-(자동형변환 된 경우만 가능)
			// 컴파일 오류없음, 런타임 오류
			Animal animal = new Dog();
			Cat cat = (Cat) animal; // <-- 오류 (ClassCastException)
			System.out.println("형변환 완료");
			
			// catch 작성시 하위를 먼저작성, 상위를 나중에작성
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0으로 나눌수 없다");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("index범위를 벗어났다");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("숫자형 문자만 변경가능하다");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("null 참조불가");
		} catch (ClassCastException e) {
			e.printStackTrace();
			System.out.println("형변환 오류");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("기타 Exception");
		}

		finally {
			// Exception발생여부 상관없이 무조건 수행
			// 자원반납
			// DB연결해제, 파일close
			System.out.println("반드시 수행하는 문장");
		}
		System.out.println("Done.");

		// try {
		// // 예외발생 가능성이 있는 문장들(업무로직)
		// int[] arr = { 1, 2, 3, 4, 5 };
		// System.out.println(c);
		// System.out.println(arr[5]);
		// } catch (ArithmeticException e) {
		// // e.printStackTrace();
		// System.out.println(e.getMessage());
		// System.out.println("0으로 나눌수 없다");
		// } catch (IndexOutOfBoundsException e) {
		// // e.printStackTrace();
		// System.out.println("index범위를 벗어남");
		// } finally {
		//
		// // Exception발생여부 상관없이 무조건 수행
		// // 자원반납
		// // DB연결해제, 파일close
		// System.out.println("반드시 수행하는 문장");
		// }
		// System.out.println("Done.");
	}
}
