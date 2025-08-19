package controlStatement;

import java.util.Scanner;

public class SwitchTask01 {
	public static void main(String[] args) {
//		계절을 맞추는 프로그램
//		봄		3,4,5
//		여름		6,7,8
//		가을		9,10,11
//		겨울		12,1,2
		
//		입력 ) 10
//		출력 ) 10월은 가을입니다.
		
		Scanner sc = new Scanner(System.in);
		int inputValue = 0;
		String result = "";
		String message = "찾으려는 달을 입력해주세요.\nex)10\n", resultMessage = "%d월은 %s입니다.\n";
		
		System.out.printf(message);
		
		inputValue = sc.nextInt();
		
		sc.close();
		
//		logic = month / 3 % 4;
		
		switch (inputValue) {
		case 3,4,5:
			result = "봄";
			break;
		case 6,7,8:
			result = "여름";
			break;
		case 9,10,11:
			result = "가을";
			break;
		case 12,1,2:
			result = "겨울";
			break;

		default:
			System.out.println("1~12의 값을 입력해주세요.");
			break;
		}
		System.out.printf(resultMessage, inputValue, result);
	}
}
