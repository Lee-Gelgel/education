package com.multi.study.jungol.code1370;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//ȸ�ǽ��� �ϳ� �ִ�. ���� ȸ�ǵ��� ���۽ð��� ����ð��� ����Ǿ� ������, �ð��밡 ��ġ�� ȸ�Ǵ� ���ÿ� ���ְ� �Ұ����ϴ�. 
//���� ���� �ð��뿡 ���ϴ� ȸ�ǵ� �� �ϳ��� �����ϰ� ������ ȸ�ǵ��� �������Ѵ�. 
//
//��, ����ð��� ���۽ð��� ���� ��쿡�� �ð��� ��ģ�ٰ� ������ �ʴ´�. ȸ���� ���� N�� �� ȸ���� ���۽ð�, 
//����ð��� �־����� �� �ǵ��� ���� ȸ�Ǹ� �����ϰ��� �Ѵ�.ȸ�Ǹ� �ִ��� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// 
//ù�ٿ��� ȸ���� �� N(5��N��500), ��° �ٺ��� i-1�� ȸ���� ��ȣ�� ���۽ð��� ����ð��� ���ʷ� �־�����. (500 ������ ����)
//
//
//ù�ٿ��� ���� ������ �ִ��� ȸ�Ǽ��� ����ϰ� ���� �ٺ��ʹ� ������ ȸ���� ��ȣ�� �ð�������� ����Ѵ�. ����, 
//���� ���� ����(�ִ�ȸ�Ǽ��� �� �� �ִ� ���� ����� ��������)��� �� �� �ƹ��ų� �ϳ� ����Ѵ�.
//
//[�Է�]
//6
//1 1 10
//2 5 6
//3 13 15
//4 14 17
//5 8 14
//6 3 12
//[���]
//3
//2 5 4

public class Code1370 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/com/multi/study/jungol/code1370/Code1370.txt"));
		Scanner scanner = new Scanner(System.in);
		// ȸ�� ���� �Է�
		insertArr(scanner);
		// ȸ�� ���� ����
		sortST(meetingReservation);
		// ȸ�� ���� ���
		printArr(meetingReservation);
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

	// ȸ�� ���� ���
	public static void printArr(int[][] meetingReservation) {
		for (int i = 0; i < meetingReservation.length; i++) {
			for (int j = 0; j < meetingReservation[i].length; j++) {
				System.out.print(meetingReservation[i][j] + " ");
			}
			System.out.println();
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

	// �ð���
	// ���� ȸ�ǵ� �� (���۽ð��� ����ð����� ���ų�ũ�� and ����ð��� ���� ���� ȸ�Ǹ� ã�Ƽ� ����)
	private static void compareTime(int[][] meetingReservation) {
		int minEndTime;
		int count;
		for (int i = 0; i < meetingReservation.length-1; i++) {
			System.out.print(i+">");
			count=1;
			minEndTime = 500;
			
			// ���� ȸ�� �� ����ð��� ���� ���� ȸ��
			for (int j = i + 1; j < meetingReservation.length; j++) {
				if(minEndTime>meetingReservation[j][2]){
					minEndTime=meetingReservation[j][2];
					System.out.print(j+">");
				}
			}
			System.out.println(count+"��");
			System.out.println();
		}

	}
	
	// public static void compareES(int[][] meetingReservation){
	// int maxCount = 1;
	// int[] resultArr = null;
	// for (int i = 0; i < meetingReservation.length-1; i++) {
	// ArrayList<Integer> meetingArr = null;
	// meetingArr = new ArrayList<>();
	// meetingArr.add(meetingReservation[i][0]);
	// int endTime = meetingReservation[i][2];
	// int count = 1;
	// for (int j = 0; j < meetingReservation.length; j++) {
	// if(endTime <= meetingReservation[j][1]){
	// endTime= meetingReservation[j][2];
	// meetingArr.add(meetingReservation[j][0]);
	// count ++;
	// }
	// }
	// if(maxCount<count){
	// maxCount=count;
	// resultArr=new int[maxCount];
	// for (int j = 0; j < resultArr.length; j++) {
	// resultArr[j] = meetingArr.get(j);
	// }
	// }
	// System.out.println();
	// }
	// System.out.println(maxCount);
	// for(int result : resultArr){
	// System.out.print(result+" ");
	// }
	// }
}
