package arrayTest;

public class ArrayTask3 {
	public static void main(String[] args) {
//  1. 1~20까지 짝수만 배열에 담고 배열안에 값에 모두 3을 더한 값으로 변경 후 출력하기
		
//		1. 10까지 반복하면서 짝수 값((i + 1) * 2)만을 배열에 담기
//		2. 각 값을 다시 처음부터 조회하면서 +3을 더해서 대입
//		3. 출력하기
		
		System.out.println("1. 1~20까지 짝수만 배열에 담고 배열안에 값에 모두 3을 더한 값으로 변경 후 출력하기");
		
		int[] arr1 = new int[10];
		String result1 = "";
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (i + 1) * 2;
		}
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] += 3;
			result1 += arr1[i] + " ";
		}
		
		System.out.println(result1 + '\n');
		
		
//  2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기
		
//		1. 배열 만들기
//		2. 반복문으로 배열의 값을 조회하면서 합계 구하기
//		3. 실수형으로 구했던 합계와 배열의 크기를 사용하여 평균 구하기
//		4. 출력하기
		
		System.out.println("2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기");
		
		int[] arr2 = {10, 20, 30, 40, 50};
		int sum = 0;
		double avg = 0.0;
		String result2 = "";
		
		for(int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
		}
		avg = (double)sum / arr2.length;
		
		result2 = "" + avg;
		System.out.println(result2 + '\n');
		
		
//  3. 1~10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기 
		
//		1. 배열을 순차적으로 접근하면서 1부터 10까지 대입하기
//				ㄴ> 단, 담을 값이 5보다 크다면 2배를 해서 대입

		System.out.println("3. 1~10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기");
		
		int[] arr3 = new int[10];
		String result3 = "";
		
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = i + 1 > 5 ? (i + 1) * 2 : i + 1;
			result3 += arr3[i] + " ";
		}
		
		System.out.println(result3 + '\n');
		
		
//  4. 1~10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4*...10 
//  단 마지막은 *이 붙지 않는다
		
//		1. 크기가 10인 배열을 만들고 순차적으로 접근하며 1~10의 값을 대입.
//		2. 처음부터 다시 조회하면서 결과 변수에 값과 *를 추가.
//				ㄴ> 마지막의 경우(인덱스가 길이 -1인 경우) *을 추가하지 않기
//		3. 출력
		
		System.out.println("4. 1~10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4*...10");
		
		int[] arr4 = new int[10];
		String result4 = "";
		
		for(int i = 0; i < arr4.length; i++) {
			arr4[i] = i + 1;
		}
		for(int i = 0; i < arr4.length; i++) {
			if(i == arr4.length -1) {
				result4 += arr4[i];
				break;
			}
			result4 += arr4[i] + "*";
		}
		
		System.out.println(result4 + '\n');
		
		
//  5. 1~10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기 
		
//		1. 크기가 10인 배열을 만들고 순차적으로 접근하면서 1~10의 값 대입
//		2. 다시 조회하면서 만약 해당 인덱스의 값이 3의 배수라면 합계 변수의 값과 연산 후 대입
//		3. 출력
		
		System.out.println("5. 1~10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기");
		
		int[] arr5 = new int[10];
		String result5 = "";
		int sum2 = 0;
		
		for(int i = 0; i < arr5.length; i++) {
			arr5[i] = i + 1;
		}
		for(int i = 0; i < arr5.length; i++) {
			if(arr5[i] % 3 == 0) sum2 += arr5[i];
			else continue;
		}
		
		result5 = ""+sum2;
		System.out.println(result5);
		
	}
}
