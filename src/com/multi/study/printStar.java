package com.multi.study;
public class printStar {
	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		
		int lineMax=7;
		int line = 0;
		int print = 0;
		int printStart, printEnd;
		printStart = printEnd = lineMax / 2;
		while (line < lineMax) {
			if (line < lineMax / 2) {
				print = 0;
				while (print < lineMax) {
					if (print >= printStart && print <= printEnd) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					print++;
				}
				printStart--;
				printEnd++;
			} else {
				if (line >= lineMax / 2) {
					print = 0;
					while (print < lineMax) {
						if (print >= printStart && print <= printEnd) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
						print++;
					}
					printStart++;
					printEnd--;
				}
			}
			System.out.println();
			line++;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("## 소요시간 : " + (endTime - startTime) / 1000.0f + "초");
	}
	
	public void Shape(){
		String[][] arrStr = new String[9][9];
		int line = 0;
		int print = 0;
		int printStart, printEnd;
		printStart = printEnd = arrStr.length / 2;
		while (line < arrStr.length) {
			if (line < arrStr.length / 2) {
				print = 0;
				while (print < arrStr[line].length) {
					if (print >= printStart && print <= printEnd) {
						arrStr[line][print] = "*";
					} else {
						arrStr[line][print] = " ";
					}
					print++;
				}
				printStart--;
				printEnd++;
			} else {
				if (line >= arrStr.length / 2) {
					print = 0;
					while (print < arrStr[line].length) {
						if (print >= printStart && print <= printEnd) {
							arrStr[line][print] = "*";
						} else {
							arrStr[line][print] = " ";
						}
						print++;
					}
					printStart++;
					printEnd--;
				}
			}
			line++;
		}
	}
}
