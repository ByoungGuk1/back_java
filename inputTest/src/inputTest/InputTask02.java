package inputTest;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
//      3개의 정수를 한 번에 입력 받은 후
//      세 정수의 곱셈을 출력
//      sc.next()만 사용
		
		Scanner sc = new Scanner(System.in);
//		String inputNum1 = null, inputNum2 = null, inputNum3 = null;
		String message = "세 정수 입력\nex)3 5 7", resultMessage = "%d * %d * %d = %d\n";
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		
		System.out.println(message);
//		inputNum1 = sc.next();
//		inputNum2 = sc.next();
//		inputNum3 = sc.next();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		sc.close();
		
//		num1 = Integer.parseInt(inputNum1);
//		num2 = Integer.parseInt(inputNum2);
//		num3 = Integer.parseInt(inputNum3);
		
		result = num1 * num2 * num3;
		
		System.out.printf(resultMessage, num1, num2, num3, result);
	}
}
