package collection;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<>();
//		값 추가하기
		datas.add(1);
		datas.add(2);
		datas.add(3);
		datas.add(4);
//		길이 구하기 -> 이전의 .length();
		System.out.println(datas.size());
//		값 출력하기
		System.out.println(datas);

//	---

//		값 조회 -> 메서드 보면 예외처리 알려줌
		try {
			System.out.println(datas.get(0));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ArrayList2 예외 발생");
			System.out.println("인덱스 범위 확인");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//	실습
//		추가(삽입)
//		50 뒤에 500 삽입
//		수정 90을 9로 수정
//		삭제
//		80을 삭제
		
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		int prev = 0;
		
		for (int i = 0; i < 100; i++) {
			arrInt.add(i + 1);
		}
		
		try {
//	50 뒤에 500 삽입
			if(arrInt.contains(50))
				arrInt.add(arrInt.indexOf(50) + 1, 500);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("arrInt.add() index error");
			System.err.println("arrInt index error");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
//	수정 90을 9로 수정
			if(arrInt.contains(90))
				prev = arrInt.set(arrInt.indexOf(90) + 1, 9);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("arrInt.set() index error");
			System.err.println("arrInt index error");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		try {
//	80을 삭제
//			1. 인덱스 삭제
//			2. 값으로 삭제
			if(arrInt.contains(80))
				arrInt.remove(80);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("arrInt.remove() index error");
			System.err.println("arrInt index error");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		System.out.println(arrInt);
		
	}
}
