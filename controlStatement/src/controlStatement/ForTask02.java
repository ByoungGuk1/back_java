package controlStatement;

public class ForTask02 {
	public static void main(String[] args) {
		System.out.println("Q. 10 ~ 1까지 출력하기");
		System.out.print("A. ");
		for(int i = 0; i < 10; i++) {
			System.out.print(10 - i + " ");
		}
		System.out.println();
		
//		---
		
		System.out.println("\nQ. \"abcd\"를 이용해서 97 ~ 100 출력");
		System.out.print("A. ");
		final String str = "abcd";
		int strAscii = 0;
		for(int i = 0; i < str.length(); i++) {
			strAscii = str.charAt(i);
			System.out.print(strAscii + " ");
		}
		System.out.println();

//		---
		
		System.out.println("\nQ. \"abcd\"를 이용해서 c 빼고 출력");
		System.out.print("A. ");
//		final String str = "abcd";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'c') continue;
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();

//		---
		
		System.out.println("\nQ. 1~30 짝수만 출력");
		System.out.print("A. ");
		for(int i = 0; i < 30; i++) {
			if((i + 1) % 2 == 1) continue;
			System.out.print(i + 1 + " ");
		}
		System.out.println();

//		---
		
		System.out.println("\nQ. 1~30 짝수의 개수를 출력");
		System.out.print("A. ");
		int count = 0;
		for(int i = 0; i < 30; i++) {
			if((i + 1) % 2 == 1) continue;
			count++;
		}
		System.out.printf("짝수의 개수는 %d입니다.", count);
		System.out.println();

//		---
		
		System.out.println("\nQ. 1~30 짝수의 총합 출력");
		System.out.print("A. ");
		int sum = 0;
		for(int i = 0; i < 30; i++) {
			if((i + 1) % 2 == 1) continue;
			sum += i + 1;
		}
		System.out.printf("짝수의 총합은 %d입니다.", sum);
		System.out.println();

//		---
		
		System.out.println("\nQ. 1~30 짝수 중 7번째 출력");
		System.out.print("A. ");
		int count1 = 0;
		for(int i = 0; i < 30; i++) {
			if((i + 1) % 2 == 1) continue;
			count1++;
			if(count1 == 7) {
				System.out.printf("짝수 중 7번째 숫자은 %d입니다.", i + 1);
				break;
			}
		}
		System.out.println();
		
//		---
		
		System.out.println("\nQ. 1~30 짝수 중 첫번째와 마지막 수만 더해서 출력");
		System.out.print("A. ");
		int count2 = 0, result = 0;
		
		for(int i = 0; i < 30; i++) {
			if((i + 1) % 2 == 1) continue;
			if(result == 0) {
				result += i + 1;
			}else {
				result -= (i + 1);
			}
			count2++;
			result += i + 1;
		}
		System.out.printf("짝수 중 첫번째와 마지막 수의 합은 %d입니다.", result);
		System.out.println();
		
	}
}
