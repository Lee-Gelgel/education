package prob2;

public class TranslateString {
	public static void main(String[] args) {
		System.out.println(initcap("multicampus"));
	}

	private static String initcap(String str) {
		//구현하시오
		String[] arrStr = str.split(" ");
		String result = "";
		for (int i = 0; i < arrStr.length; i++) {
			result += arrStr[i].substring(0, 1).toUpperCase() + arrStr[i].substring(1, arrStr[i].length()).toLowerCase()+" ";
		}
		return result.trim();
	}
}
