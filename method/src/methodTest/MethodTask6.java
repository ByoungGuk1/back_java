package methodTest;

import java.util.Scanner;

public class MethodTask6 {
//	문자열을 입력받고 원하는 문자의 개수를 구하는 메서드
	
//	알고리즘
//	1.문자열과 찾을 문자를 받기
//	2.반복문을 돌면서 문자열을 조회
//	3.조회하면서 입력받은 문자와 같은지 비교
//	4.만일 동일하다면 동일한 만큼의 횟수 저장
//	5.결과의 횟수 반환
	
//	.replaceAll() 이용해보기.
	int getCharTimes(String str, char ch) {
		int times = 0;
		
		for(int i = 0; i < str.length(); i++) {
			times = str.charAt(i) == ch ? times + 1 : times;
		}
		
		return times;
	}
	
	public static void main(String[] args) {
//	스캐너로 사용자가 원하는 문자열 받기
//	스캐너로 사용자가 찾으려는 문자 받기
//	만든 메서드를 이용하여 반복횟수를 구하여 저장
//	결과 출력
		Scanner sc = new Scanner(System.in);
		MethodTask6 mt = new MethodTask6();
		String input = null, result = "";
		char inputChar = ' ';
		
		System.out.println("찾으려는 문자열을 입력해주세요\nex)asdfasdf");
		input = sc.next();
		
		System.out.println("찾으려는 문자를 입력해주세요\nex)d");
		inputChar = sc.next().charAt(0);
		
		sc.close();
		
		result = "" + mt.getCharTimes(input, inputChar);
		System.out.println(result);
	}
}
