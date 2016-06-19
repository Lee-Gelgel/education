package com.multi.study.jungol.code1669;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

//�����̰� �ҽ��� ���忡 ������ ����. �� �ҽ������忡���� �ϳ��� ��谡 ���̿� �ʺ� �پ��� �ҽ����� ����� ���� �־���.
//
//������ ���캸�� �� ���� ���� ����� �ִ� �ҽ����� ���̿� �ʺ� �ٷ� ���� ������� �ҽ����� ����, �ʺ񺸴� ũ�ų� ���ƾ߸� ��谡 ���� �ʰ� �۵��ϰ� �־���. ���� ���� ����� �ִ� �ҽ����� ���� �Ǵ� �ʺ� �ٷ� ���� ���� �ͺ��� �۴ٸ�, ��谡 �غ� �۾��� �ϴµ� 1���� �ҿ�ȴٴ� ���� �˾Ҵ�.
// 
//�����̴� �ֹ� ���� �ҽ����� ���̿� �ʺ� ���� � �ҽ������� ����� ������ ���� ����� �غ� �۾��� �ҿ�Ǵ� �ð��� ���� �� ������ ����ϰ� �ִ�.
// 
//�ֹ����� �ҽ������� ����µ� ��谡 �غ� �۾��� �ҿ��� �ּ��� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// 
//��, ù �ҽ����� ���� ���� ����� �غ��۾� �ð��� 1�� �ҿ�ȴ�.
// 
//ù �ٿ��� �ֹ����� �ҽ����� ���� N(1��N��5,000)�̴�. 
//
//��° �ٿ��� �ҽ����� ���� SL�� �ҽ����� �ʺ� SW�� N���� ������ �����ȴ�.
//
//
//�ֹ����� �ҽ������� ����µ� ��谡 �غ� �۾��� �ҿ��� �ּ��� �ð��� ����Ѵ�.
//
//[�Է�]
//5 
//4 9 5 2 2 1 3 5 1 4
//[���]
//2
//
//
//[�Է�]
//3
//1 3 2 2 3 1
//[���]
//3

public class Code1660 {

	static ArrayList<Integer> caseArrSL = new ArrayList<>();
	static ArrayList<Integer> caseArrSW = new ArrayList<>();
	static int testCase;
	static int result;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/com/multi/study/jungol/code1669/Code1660.txt"));
		Scanner scanner = new Scanner(System.in);
		insertArr(scanner);
		printArr();

		compareMax();

	}


	// maxSL, SW ��ȸ
	public static int compareMax() {
		// maxSL �� SW ��ȸ
		int maxSL = 0;
		int maxSW = 0;
		int maxNum = 0;
		for (int i = 0; i < caseArrSL.size(); i++) {
			if (maxSL < caseArrSL.get(i) && maxSW < caseArrSW.get(i)) {
				maxSL = caseArrSL.get(i);
				maxSW = caseArrSW.get(i);
				maxNum = i;
			}
		}
		System.out.println(maxSL + ", " + maxSW + ", " + maxNum);
		return maxNum;
	}

	// ���� �Է�
	public static void insertArr(Scanner scanner) {
		testCase = Integer.parseInt(scanner.nextLine().trim());
		result = 0;

		System.out.println(testCase);
		while (scanner.hasNext()) {
			caseArrSL.add(scanner.nextInt());
			caseArrSW.add(scanner.nextInt());
		}
	}

	// ���� ���
	public static void printArr() {
		for (int i = 0; i < caseArrSL.size(); i++) {
			System.out.println(caseArrSL.get(i) + ", " + caseArrSW.get(i));
		}
	}

}
