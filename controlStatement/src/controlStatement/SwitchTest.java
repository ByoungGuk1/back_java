package controlStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "mbti를 입력해주세요.\nex)ENFP\n";
		String inputValue = null;
		
		System.out.printf(message);
		inputValue = sc.next();
		
		sc.close();
		
		switch (inputValue) {
		case "ENFP":
			System.out.println("게으름");
			break;
		case "ISTP":
			System.out.println("반항가");
			break;
		case "ESFP":
			System.out.println("고집");
			break;
		case "ESTJ":
			System.out.println("설명");
			break;

		default:
			break;
		}
	}
}
