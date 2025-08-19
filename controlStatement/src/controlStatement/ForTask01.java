package controlStatement;

import java.util.Scanner;

public class ForTask01 {
	public static void main(String[] args) {
//      아래와 같은 문자열이 있을 때
//      문자열은 연결시키고, 숫자는 연산하여 결과를 알려준다
//      사용자가 임의로 정수와 알파벳을 입력할 때
//      "abZ182bePz92"
//      출력 예시) 문자열: abZbePz, 정수: 22
//      .charAt(인덱스)
		Scanner sc = new Scanner(System.in);
		String inputValue = "123", strings = "";
		String message = "문장을 입력해주세요";
		int numbers = 0;
		
		System.out.println(message);
		
		inputValue = sc.next();
		sc.close();
		
		for(int i = 0; i < inputValue.length(); i++) {
			int selectChar = inputValue.charAt(i);
			if((selectChar >= 'A' && selectChar <= 'Z')||(selectChar >= 'a' && selectChar <= 'z')) {
				strings += inputValue.charAt(i);
			} else {
				numbers += inputValue.charAt(i) - '0';
			}
		}
		
		System.out.printf("문자열 : %s, 정수 : %d", strings, numbers);
	}
}
