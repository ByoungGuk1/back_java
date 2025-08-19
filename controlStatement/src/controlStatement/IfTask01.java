package controlStatement;

import java.util.Scanner;

public class IfTask01 {
	public static void main(String[] args) {
//		두 수의 크기 비교
//		10 20
//		큰 값 : 20, 작은 값 : 10
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, large = 0, small = 0;
		String inputNum1 = null, inputNum2 = null;
		String message = "두 정수를 입력해주세요\nex)10 20\n", resultMessage = "큰 값 : %d, 작은 값 : %d\n";
		
		System.out.printf(message);
		
		inputNum1 = sc.next();
		inputNum2 = sc.next();
		
		sc.close();
		
		num1 = Integer.parseInt(inputNum1);
		num2 = Integer.parseInt(inputNum2);

		if(num1 == num2) {
			System.out.printf("두 수는 %d로 같은 수 입니다.", num1);
		}else if(num1 > num2) {
			large = num1;
			small = num2;
		}else if(num1 < num2) {
			large = num2;
			small = num1;
		}
		
		System.out.printf(resultMessage, large, small);
	}
}
