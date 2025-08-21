package methodTest;

import java.util.Scanner;

public class MethodTask5 {
//1. 1~n까지의 합을 구해서 결과를 반환해주는 메서드
	int sumOneToN(int num) {
		int sum = 0;
		for(int i = 0; i < num; i++) {
			sum += i + 1;
		}
		return sum;
	}
	
//2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
	String returnType(String strNum) {
//		기능별로 분리해서 로직짜기 -> 가능하면 최대한 분리하기, 한번에 로직 처리 자제
		int num = 0;
		String answer = "";
		for(int i = 0; i < strNum.length(); i++) {
			if(strNum.charAt(i) >= '0' && strNum.charAt(i) <= '9') {
				num = num * 10 + (strNum.charAt(i) - '0');
			}else {
				return "문자열입니다.";
			}
		}
		answer = num % 2 == 0 ? "짝수" : "홀수";
		return answer;
	}
	
//3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
	void printUpper(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				result += (char)(str.charAt(i) -  ('a' - 'A'));
			}
			else result += str.charAt(i);
		}
		System.out.println(result);
	}
	
//4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
//입력 예시) abcdef
//출력 예시) fedcba
	void reverseString(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			result += str.charAt(str.length() - 1 - i);
		}
		System.out.println(result);
	}
	
	
//5. 1~4번까지 메서드 사용
	public static void main(String[] args) {
		MethodTask5 mt5 = new MethodTask5();
		Scanner sc = new Scanner(System.in);
		int result1 = 0;
		String result2 = "", input = null;
		
		System.out.println("1부터 n까지의 합 구하기\nn값을 입력해주세요\nex)5");
		input = sc.next();
		result1 = mt5.sumOneToN(Integer.parseInt(input));
		input = "";
		System.out.println(result1);
		
		System.out.println("어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드\n확인할 값을 입력해주세요");
		input = sc.next();
		result2 = mt5.returnType(input);
		input = "";
		System.out.println(result2);
		
		System.out.println("문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드\n문자열을 입력해주세요");
		input = sc.next();
		mt5.printUpper(input);
		input = "";
		
		System.out.println("어떤 문자열을 전달하면 반대로 출력해주는 메서드\n"
				+ "입력 예시) abcdef\n"
				+ "출력 예시) fedcba");
		input = sc.next();
		mt5.reverseString(input);
		input = "";
		
		
//		스캐너 종료
		sc.close();
	}
}
