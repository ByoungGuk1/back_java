package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas1 = new ArrayList<Integer>();
		
//		1 ~ 10까지 추가
		IntStream.rangeClosed(1, 10).forEach(n -> {datas1.add(n);});
		
//		datas1에서 stream 문법으로 1~5까지 삭제하기
		IntStream.range(0, 5).forEach((n) -> datas1.remove(0));
		
//		참조할 수 없는 알고리즘
//		IntStream.range(0, 5).forEach(datas1::remove);
		System.out.println(datas1);
		
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
//		10 ~ 1까지 추가 후 출력
		IntStream.range(0, 10).forEach((n) -> { datas2.add(10 - n);});
		System.out.println(datas2);
		
		
		ArrayList<String> datas3 = new ArrayList<String>();
//		"ABCDEFGHIJK"을 datas3에 각각 한 글자씩 추가 후 출력하기
//		"A", "B", "C", ... "K"
//		"ABCDEFGHIJK".chars().forEach((n) -> {datas3.add(String.valueOf((char)n));});
//		datas3.forEach(System.out::print);

		
		ArrayList<String> datas4 = new ArrayList<String>();
//		"aBcDeFgHiJk"을 datas4에 소문자만 각각 한 글자씩 추가 후 출력하기
//		"aBcDeFgHiJk".chars().forEach((n) -> {
//				if(n >= 97 && n <= 122) {
//					datas4.add(String.valueOf((char)n));
//				}
//			});
//		datas4.forEach(System.out::print);
		
		ArrayList<String> datas5 = new ArrayList<String>();
//		"aBcDeFgHiJk" datas5에 모두 대문자로 변경 후 추가, 그리고 모두 출력
		"aBcDeFgHiJk".toUpperCase().chars().forEach((n) -> {datas5.add(String.valueOf((char)n));});
		datas5.forEach((s) -> {System.out.print(s);});
		
	}
}











