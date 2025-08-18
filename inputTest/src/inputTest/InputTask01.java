package inputTest;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
		
		//사용자에게 정수를 2개 입력 받고,
		//두 수를 더해서 출력하기
		//30 
		//50
		//출력: 80
		//단, 메서드는 .next()만 사용
		
		Scanner sc = new Scanner(System.in);
		String inputNum1 = null, inputNum2 = null;
		int num1 = 0, num2 = 0, result = 0;
		
		System.out.println("두 수 입력");
		inputNum1 = sc.next();
		inputNum2 = sc.next();
		
		sc.close();
		
		num1 = Integer.parseInt(inputNum1);
		num2 = Integer.parseInt(inputNum2);
		
		result = num1 + num2;
		
		System.out.println(result);
	}
}
