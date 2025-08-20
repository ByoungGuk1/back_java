package controlStatement;

import java.util.Scanner;

public class ForTask04 {
	public static void main(String[] args) {
		
		final String quest = "Q. %s\n",answer = "A. %s\n\n";
		
//		---

		System.out.printf(quest,
				"해당 문자와 반복할 횟수를 입력하면 전체 문자열을 만들어주는 프로그램\n"
				+ "입력 예시) a1b3d2c4\n"
				+ "출력 예시) abbbddcccc\n"
				+ "단, 횟수는 1~9까지 입력");
		
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		char inputChar = ' ';
		String inputValue = null, result = "";
		
		inputValue = sc.next();
		sc.close();
		
		for(int i = 0; i < inputValue.length(); i += 2) {
			inputChar = inputValue.charAt(i);
			inputNum = inputValue.charAt(i+1) - '0';
			for(int j = 0; j < inputNum; j++) {
				result += inputChar;
			}
		}
		System.out.printf(answer, result);

	}
}
