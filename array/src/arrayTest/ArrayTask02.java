package arrayTest;

import java.util.Scanner;

public class ArrayTask02 {
	public static void main(String[] args) {
//		1. 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//		대문자는 모두 소문자로 변경한다.
//		입력 예)안녕hI!!
//		출력 예)안녕Hi!!
		
//		알고리즘
//		1. 사용자에게 입력받기
//		2. 문자열을 한 글자씩 가져오면서 (반복문)
//				ㄴ> 대문자, 소문자, 기타로 구분하기
//		3. 구분된 글자 중 대문자는 소문자로, 소문자는 대문자로 변환해서 캐릭터 배열에 순차적으로 대입
//		4. 변환이 완료된 배열을 출력
		System.out.println("1. 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로, \n대문자는 모두 소문자로 변경한다.\n"
			+ "입력 예)안녕hI!!\n"
			+ "출력 예)안녕Hi!!");
		Scanner sc = new Scanner(System.in);
		int length = 0;
		char[] arrChar = null;
		String input = null, result = "";
		
		input = sc.nextLine();
		length = input.length();
		arrChar = new char[length];
		
		for(int i = 0; i < length; i++) {
			if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				arrChar[i] = (char)(input.charAt(i) + ('a' - 'A'));
			}else if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){
				arrChar[i] = (char)(input.charAt(i) - ('a' - 'A'));
			}else {
				arrChar[i] = input.charAt(i);
			}
		}
		
		for(int i = 0; i < length; i++) {
			result += arrChar[i];
		}
		
		System.out.println(result + "\n");
		

		
//		2. 정수를 한글로 변경		  
//		입력 예) 1024
//		출력 예) 일공이사
		
//		알고리즘
//		1.사용자에게 입력받기
//		2.입력받은 수를 한 글자씩 가져오기
//		3.가져온 수를 switch 문을 사용하여 배열에 한글로 대입
//		4.반복이 종료된 후, 배열을 순차적으로 출력
		System.out.println("2. 정수를 한글로 변경\n"
				+ "입력 예) 1024\n"
				+ "출력 예) 일공이사");

//		Scanner sc = new Scanner(System.in);
		String inputNum = null, result2 = "";
		char[] arrChar2 = null;
		int number = 0, length2 = 0;
		
		inputNum = sc.next();
		length2 = inputNum.length();
		arrChar2 = new char[length2];
		
		for(int i = 0; i < length2; i++) {
			number = inputNum.charAt(i) - '0';
			switch (number) {
			case 0:
				arrChar2[i] = '공';
				break;
			case 1:
				arrChar2[i] = '일';
				break;
			case 2:
				arrChar2[i] = '이';
				break;
			case 3:
				arrChar2[i] = '삼';
				break;
			case 4:
				arrChar2[i] = '사';
				break;
			case 5:
				arrChar2[i] = '오';
				break;
			case 6:
				arrChar2[i] = '육';
				break;
			case 7:
				arrChar2[i] = '칠';
				break;
			case 8:
				arrChar2[i] = '팔';
				break;
			case 9:
				arrChar2[i] = '구';
				break;

			default:
				System.out.println("Error");
				break;
			}
		}
		for(int i = 0; i < length2; i++) {
			result2 += arrChar2[i];
		}
		
		System.out.println(result2);
		
		
//		scanner 종료
		sc.close();
	}
}
