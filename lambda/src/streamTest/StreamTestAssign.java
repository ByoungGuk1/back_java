package streamTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTestAssign {
//	public void printodd(int num) {
//		return num%2==1?num:0;
//	}
	
	public static void main(String[] args) {
//		0~9 대입
		ArrayList<Integer> datas = new ArrayList<Integer>();

//		IntStream	-> 
//		.range(n, m)	-> n부터 m까지, n은 포함 m은 제외
//		.rangeClosed(n, m)	-> n부터 m까지, n,m 모두 포함
		IntStream.rangeClosed(0, 10).forEach((number) -> {
			datas.add(number);
		});

//		1~5까지 스트림문법으로 출력하기
//		IntStream.range(0, 5).forEach((range) -> {
//			System.out.print(range + 1 + " ");
//		});
//		System.out.println();

//		참조형 문법
//		.(소속::메서드명)
//		IntStream.rangeClosed(1, 5).forEach(System.out::print);
//		클래스명::메서드명

		System.out.println(datas);
//		0~10까지 짝수만 출력하기
		datas.stream().filter(data -> data % 2 == 0).forEach(System.out::print);
		System.out.println();

//		datas 홀수만 출력하기
		datas.stream().filter(data -> data % 2 == 1).forEach(System.out::print);
		System.out.println();

//		.stream(): 컬렉션을 Stream객체로 변경
//		.chars() : 문자열을 Stream 객체로 변경
		"ABCD".chars().forEach((data)->{
			System.out.println((char)data);
		});

	}
}
