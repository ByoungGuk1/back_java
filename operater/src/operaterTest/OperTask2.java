package operaterTest;

import java.util.Scanner;

public class OperTask2 {
	public static void main(String[] args) {
//		3개의 입력값 중 중간 값 찾기
//		ex) 17 25 35	-> 25
//			10 3 8		-> 8
		Scanner sc = new Scanner(System.in);
//		String inputNum1 = "", inputNum2 = "", inputNum3 = "";
		int num1 = 0, num2 = 0, num3 = 0, tmp = 0;
		String message = "세개의 정수를 입력해 주세요\nex)17 25 35", resultMessage = "입력값은 %d, %d, %d이고\n중간값은 %d 입니다.\n";
		
		System.out.println(message);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		sc.close();

		tmp = num1;
		num1 = num1 > num2 ? num2 : num1;
		num2 = num2 == num1 ? tmp : num2;
		
		tmp = num2;
		num2 = num2 > num3 ? num3 : num2;
		num3 = num3 == num2 ? tmp : num3;
		
		tmp = num1;
		num1 = num1 > num2 ? num2 : num1;
		num2 = num2 == num1 ? tmp : num2;

		System.out.printf(resultMessage, num1, num2, num3, num2);
	}
}
