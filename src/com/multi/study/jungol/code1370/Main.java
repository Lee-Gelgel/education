package com.multi.study.jungol.code1370;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		//System.setIn(new FileInputStream("src/com/multi/study/jungol/code1370/Code1370.txt"));
		Scanner scanner = new Scanner(System.in);
		// ȸ�� ���� �Է�
		insertArr(scanner);
		// ȸ�� ���� ����
		sortST(meetingReservation);
		// ���� ���
		compareTime(meetingReservation);
	}

	static String meetingCnt; // ���� ������ ȸ�� ��
	static String[] meetingSchedule; // ������ ȸ���� ��ȣ �迭
	static int[][] meetingReservation; // ����� ȸ���� �迭;

	// ȸ�� ���� �Է�
	public static void insertArr(Scanner scanner) {
		// meetingReservationCnt = ����� ȸ�� ��
		int meetingReservationCnt = Integer.parseInt(scanner.nextLine());
		// �迭 ����
		meetingReservation = new int[meetingReservationCnt][3];
		while (scanner.hasNext()) {
			// ȸ������ �Է��ϴ� �ݺ���
			for (int i = 0; i < meetingReservation.length; i++) {
				// ȸ�� ������ �� �׸��� ����(ȸ�ǹ�ȣ, ���۽ð�, ����ð�)
				String[] str = scanner.nextLine().split(" ");
				for (int j = 0; j < meetingReservation[i].length; j++) {
					meetingReservation[i][j] = Integer.parseInt(str[j]);
				}
			}
		}
	}

	// ȸ�� ���� ���۽ð� �������� ����
	public static void sortST(int[][] meetingReservation) {
		// �ӽ����� �迭
		int[] arrTemp = new int[3];

		// ���۽ð� �������� ����
		for (int i = 0; i < meetingReservation.length - 1; i++) {
			for (int j = 0; j < meetingReservation.length - 1; j++) {

				// �չ迭 ���۽ð��� �޹迭 ���۽ð����� Ŭ�� ����
				if (meetingReservation[j][1] > meetingReservation[j + 1][1]) {
					for (int k = 0; k < meetingReservation[j].length; k++) {
						arrTemp[k] = meetingReservation[j][k];
					}
					for (int k = 0; k < meetingReservation[j].length; k++) {
						meetingReservation[j][k] = meetingReservation[j + 1][k];
					}
					for (int k = 0; k < meetingReservation[j].length; k++) {
						meetingReservation[j + 1][k] = arrTemp[k];
					}
				}

				// ���۽ð��� ������ ����ð� �������� ����
				if (meetingReservation[j][1] == meetingReservation[j + 1][1]
						&& meetingReservation[j][2] > meetingReservation[j + 1][2]) {
					for (int k = 0; k < meetingReservation[j].length; k++) {
						arrTemp[k] = meetingReservation[j][k];
					}
					for (int k = 0; k < meetingReservation[j].length; k++) {
						meetingReservation[j][k] = meetingReservation[j + 1][k];
					}
					for (int k = 0; k < meetingReservation[j].length; k++) {
						meetingReservation[j + 1][k] = arrTemp[k];
					}
				}
			}
		}

	}

	// ȸ�� ���� ���
	public static void printArr(int[][] meetingReservation) {
		for (int i = 0; i < meetingReservation.length; i++) {
			for (int j = 0; j < meetingReservation[i].length; j++) {
				System.out.print(meetingReservation[i][j] + " ");
			}
			System.out.println();
		}
	}

	// ���� ȸ�ǵ� �� (���۽ð��� ���� ������ ȸ�� ����ð����� ���ų� ũ��, ����ð��� ���� ����) ȸ�Ǹ� ����
	public static void compareTime(int[][] meetingReservation) {
		// ���� ���� ���� �� ��
		int maxCount = 0;
		// ���� ���� ���� �� ���� ���۹�ȣ
		int maxNum = 0;
		// ���� �� ��
		int count = 0;
		
		// ���۹�ȣ ó������ ������ �ѹ��� �����ϴ� �ݺ���
		for (int k = 0; k < meetingReservation.length; k++) {
			count = 0;
			// ���� �ϴ� �ݺ���
			for (int i = k; i < meetingReservation.length; i++) {
				count++;
				// ����ð� �񱳺���
				int minTime = 500;
				// ����ð��� ���� ���� ȸ��
				int minNum = meetingReservation.length;
				// ���۽ð����� ���ų� �����̰�, ����ð��� ���� ���� ȸ�� ã�� �ݺ���
				for (int j = i + 1; j < meetingReservation.length; j++) {
					if (meetingReservation[j][1] >= meetingReservation[i][2] && minTime > meetingReservation[j][2]) {
						minTime = meetingReservation[j][2];
						minNum = j;
					}
				}
				i = minNum - 1;
			}
			
			// ���� ���� ���� ������ �� ����, ���۹�ȣ�� ����
			if (maxCount < count) {
				maxCount = count;
				maxNum = k;
			}
		}
		
		// ���� ���� ���� �������� ���۹�ȣ�� ���
		count = 0;
		ArrayList<Integer> resultArr = new ArrayList<>();
		for (int i = maxNum; i < meetingReservation.length; i++) {
			count++;
			resultArr.add(meetingReservation[i][0]);
			int minTime=500;
			int minNum = meetingReservation.length;
			for (int j = 0; j < meetingReservation.length; j++) {
				if (meetingReservation[j][1] >= meetingReservation[i][2] && minTime > meetingReservation[j][2]) {
					minTime = meetingReservation[j][2];
					minNum = j;
				}
			}
			i = minNum - 1;
		}
		System.out.println(count);
		for(Integer integer : resultArr){
			System.out.print(integer+" ");
		}
	}

}
