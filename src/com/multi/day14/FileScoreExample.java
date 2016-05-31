package com.multi.day14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

class Score {
	String name;
	int kor;
	int eng;
	int math;

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

}

public class FileScoreExample {
	public static void main(String[] args) {
		FileScoreExample fileScoreExample = new FileScoreExample();
		String fileName = "src/com/multi/day14/data.txt";
		fileScoreExample.printScore(fileName);
		Vector<Score> vector = fileScoreExample.getScore(fileName);
		for (Score s : vector) {
			System.out.println(s);
		}

	}

	public Vector<Score> getScore(String fileName) {

		Vector<Score> list = new Vector<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String data = null;
			int index = 0;
			while ((data = br.readLine()) != null) {
				if (index != 0) {
					StringTokenizer st = new StringTokenizer(data, "/");
					String[] str = new String[st.countTokens()];
					for (int i = 0; st.hasMoreTokens(); i++) {
						str[i] = st.nextToken();
					}
					// String str[] = data.split("/");
					Score score = new Score(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]),
							Integer.parseInt(str[3]));
					list.add(score);
				}
				index++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void printScore(String fileName) {
		String data = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			for (int i = 0; (data = br.readLine()) != null; i++) {
				StringTokenizer st = new StringTokenizer(data, "/");
				int total = 0;
				for (int j = 0; st.hasMoreTokens(); j++) {
					if (i != 0 && j != 0) {
						String str = st.nextToken();
						total += Integer.parseInt(str);
						System.out.print(str + "\t");
					} else {
						System.out.print(st.nextToken() + "\t");
					}
				}
				if (i != 0) {
					System.out.print(total);
				} else {
					System.out.print("รัมก");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
