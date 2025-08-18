package inputTest;

import java.util.Scanner;
// CTRL + SHIFT + O
// 자동 import

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력해주세요.", /*firstName = null, lastName = null,*/ name = null;
		
		System.out.println(message);
//		lastName = sc.next();
//		firstName = sc.next();
		
		name = sc.nextLine();

		sc.close();
		
		System.out.printf("%s님 환영합니다.", /*lastName, firstName,*/ name);
	}
}
