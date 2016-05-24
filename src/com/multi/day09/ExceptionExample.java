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
			// 1.�������
			// ������ ��������, ��Ÿ�� ����
			int a = 10;
			int b = 10;
			int c = a / b; // <--���� (ArithmeticException)
			System.out.println(c);

			// 2.index��������
			// ������ ��������, ��Ÿ�� ����
			int[] arr = { 1, 2, 3, 4, 5 };
			System.out.println(arr[1]); // <--���� (IndexOutOfBoundsException)

			// 3. ����->����
			// ������ ��������, ��Ÿ�� ����
			String s = "3";
			int i = Integer.parseInt(s); // <--���� (NumberFormatException)
			System.out.println(i);

			// 4. null ����
			// ������ ��������, ��Ÿ�� ����
			String str = "JAVA";
			System.out.println(str.length()); // <--���� (NullPointerException)
			
			// 5. �ڵ�����ȯ : ���� = ���� // ��������ȯ : ���� = (����) ���� <-(�ڵ�����ȯ �� ��츸 ����)
			// ������ ��������, ��Ÿ�� ����
			Animal animal = new Dog();
			Cat cat = (Cat) animal; // <-- ���� (ClassCastException)
			System.out.println("����ȯ �Ϸ�");
			
			// catch �ۼ��� ������ �����ۼ�, ������ ���߿��ۼ�
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0���� ������ ����");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("index������ �����");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("������ ���ڸ� ���氡���ϴ�");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("null �����Ұ�");
		} catch (ClassCastException e) {
			e.printStackTrace();
			System.out.println("����ȯ ����");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��Ÿ Exception");
		}

		finally {
			// Exception�߻����� ������� ������ ����
			// �ڿ��ݳ�
			// DB��������, ����close
			System.out.println("�ݵ�� �����ϴ� ����");
		}
		System.out.println("Done.");

		// try {
		// // ���ܹ߻� ���ɼ��� �ִ� �����(��������)
		// int[] arr = { 1, 2, 3, 4, 5 };
		// System.out.println(c);
		// System.out.println(arr[5]);
		// } catch (ArithmeticException e) {
		// // e.printStackTrace();
		// System.out.println(e.getMessage());
		// System.out.println("0���� ������ ����");
		// } catch (IndexOutOfBoundsException e) {
		// // e.printStackTrace();
		// System.out.println("index������ ���");
		// } finally {
		//
		// // Exception�߻����� ������� ������ ����
		// // �ڿ��ݳ�
		// // DB��������, ����close
		// System.out.println("�ݵ�� �����ϴ� ����");
		// }
		// System.out.println("Done.");
	}
}
