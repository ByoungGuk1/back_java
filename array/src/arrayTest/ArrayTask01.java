package arrayTest;

import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
		String quest = "Q. %s\n", answer = "A. %s\n\n";
		
//  브론즈
//  10~1까지 중 짝수만 배열에 담고 출력
		
//		0	10
//		1	8
//		2 6
//		3	4
//		4	2
		
		System.out.printf(quest,"10~1까지 중 짝수만 배열에 담고 출력");
		int[] arr1 = new int[5];
		String result1 = "";
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = 10 - i * 2; 
			result1 += arr1[i] + " ";
		}
		System.out.printf(answer, result1);

//  1~10까지 배열에 담고 출력

		System.out.printf(quest,"1~10까지 배열에 담고 출력");
		int[] arr2 = new int[10];
		String result2 = "";
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i + 1;
			result2 += arr2[i] + " ";
		}
		System.out.printf(answer, result2);
		
//  1~100까지 배열에 담은 후 홀수만 출력
		System.out.printf(quest,"1~100까지 배열에 담은 후 홀수만 출력");
		int[] arr3 = new int[100];
		String result3 = "";
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = i + 1;
		}
		for(int i = 0; i < arr3.length; i += 2) {
			result3 += arr3[i] + " ";
		}
		System.out.printf(answer, result3);
  
//  실버
//  1~100까지 배열에 담은 후 짝수의 합 출력
		System.out.printf(quest,"1~100까지 배열에 담은 후 짝수의 합 출력");
		int[] arr4 = new int[100];
		int evenSum = 0;
		for(int i = 0; i < arr4.length; i++) {
			arr4[i] = i + 1;
		}
		for(int i = 0; i < arr4.length; i += 2) {
			evenSum += arr4[i + 1];
		}
		System.out.printf(answer, ""+evenSum);
		
//  A~F까지 배열에 담고 출력
		System.out.printf(quest,"A~F까지 배열에 담고 출력");
		char[] arr5 = new char['F' - 'A' + 1];
		String result5 = "";
		for(int i = 0; i < arr5.length; i++) {
			arr5[i] = (char)('A' + i);
			result5 += arr5[i];
		}
		System.out.printf(answer, result5);
		
//  A~F까지 중 C제외하고 배열에 담은 후 출력
		System.out.printf(quest,"A~F까지 중 C제외하고 배열에 담은 후 출력");
		char[] arr6 = new char['F' - 'A'];
		String result6 = "";
		for(int i = 0; i < arr6.length; i++) {
			arr6[i] = 'A' + i >= 'C'? (char)('A' + i + 1):(char)('A' + i);
			result6 += arr6[i];
		}
		System.out.printf(answer, result6);
  
//  골드
//  5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		System.out.printf(quest,"5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력");
		Scanner sc = new Scanner(System.in);
		int[] arr7 = new int[5];
		int max = 0, min = 0;
		System.out.println("\n다섯개의 정수를 입력해주세요.\nex)1 5 2 3 4");
		for(int i = 0; i < arr7.length; i++) {
			arr7[i] = sc.nextInt();
		}
		for(int i = 0; i < arr7.length; i++) {
			if(i == 0) min = arr7[i];
			if(min > arr7[i]) min = arr7[i];
			if(max < arr7[i]) max = arr7[i];
		}
		System.out.printf("A. 최대값은 %d이고, 최소값은 %d입니다.\n\n", max, min);
		
//  다이아
//  사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		System.out.printf(quest,"사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기");
		int inputArrSize = 0, sum = 0;
		double avg = 0.0;
		int[] arr8 = null;
		System.out.println("\n만들고 싶은 배열의 크기를 정수로 입력해 주세요.\nex)5");
		inputArrSize = sc.nextInt();
		arr8 = new int[inputArrSize];
		System.out.println("입력하신 개수만큼 정수를 입력해주세요.\nex)3을 입력했었다면, 3 5 9");
		for(int i = 0; i < inputArrSize; i++) {
			arr8[i] = sc.nextInt();
		}
		for(int i = 0; i < inputArrSize; i++) {
			sum += arr8[i];
		}
		avg = (double)sum / inputArrSize;
		System.out.printf("A. 입력한 배열의 크기는 %d이고, 총 합은 %d, 평균은 %.2f입니다.\n\n", inputArrSize, sum, avg);

//	---스캐너 닫기---
		sc.close();
	}
}
