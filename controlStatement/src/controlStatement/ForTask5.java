package controlStatement;

import java.util.Scanner;

public class ForTask5 {
	public static void main(String[] args) {
		
		final String quest = "Q. %s\n", answer = "A. %s\n\n";
		
//		---1---

		System.out.printf(quest, "1. ACEG...Z 출력!");
		
		String result1 = "";
		for(int i = 0; i < 'z'-'a'; i += 2) {
			result1 += (char)('A' + i);
		}
		
		System.out.printf(answer, result1);
		
//		---2---
		
		System.out.printf(quest, "2. 1 ~ N까지의 합 출력!");
		
		Scanner sc = new Scanner(System.in);
		int inputValue = 0, result2 = 0;
		
		inputValue = sc.nextInt();
//		sc.close();
		
		for(int i = 0; i < inputValue; i++) {
			result2 += i + 1;
		}
		
		System.out.printf(answer, result2);
		
//		---3---
		
		System.out.printf(quest, "3. 0123401234 출력!");
		
		String result3 = "";
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				result3 += j;
			}
		}
		System.out.printf(answer, result3);
		
//	---4---

		System.out.printf(quest, "4. 입력예시) a1b22c357\n"
				+ "abbbbbbbbbbbbbbccccccccccccccccccccccccccccccccc\n"
				+ "사용자가 입력한 횟수가 얼마가 있을지 모르고, \n"
				+ "입력한 횟수만큼 반복해주는 프로그램 만들기");
		
//		Scanner sc = new Scanner(System.in);
		String result4 = "", input = null;
		char inputChar = ' ';
		int count = 0;
		
		input = sc.next();
		sc.close();
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				count = count * 10 + (input.charAt(i) - '0');
			}else {
				if(i != 0) {
					for(int j = 0; j < count; j++) {
						result4 += inputChar;
					}
					count = 0;
				}
				inputChar = (char)input.charAt(i);
			}
			if(i == input.length() - 1) {
				for(int j = 0; j < count; j++) {
					result4 += inputChar;
				}
			}
		}
		System.out.printf(answer, result4);
		
		
	}
}
