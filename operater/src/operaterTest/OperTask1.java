package operaterTest;

import java.util.Scanner;

public class OperTask1 {
	public static void main(String[] args) {
//		사용자가 입력한 값이 정수인지 실수인지 확인하여 결과 출력하기
		
		Scanner sc = new Scanner(System.in);
		String inputValue = "", result = "";
		String message = "정수 또는 실수를 입력해주세요\nex)1.1", resultMessage = "입력한 값은 %s이고, 그 값은 \"%s\" 입니다.\n";
		double doubleTypeValue = 0.0;
		boolean logic = false;
				
		System.out.println(message);
		inputValue = sc.next();
		sc.close();
		doubleTypeValue = Double.parseDouble(inputValue);
		
//		logic = doubleTypeValue % 1 == 0;
		logic = doubleTypeValue - (int)doubleTypeValue == 0;
		
		result = logic ? "정수" : "실수";
		System.out.printf(resultMessage, inputValue, result);
	}
}
