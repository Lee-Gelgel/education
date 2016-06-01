package prob3;

public class Student {
	private String name;
	private int javaScore;

	public Student(String name, int javaScore) {
		this.name = name;
		this.javaScore = javaScore;
	}

	public String toString() {
		return name + " 학생의 JAVA 점수 : " + javaScore;
	}	
}
