package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> mbti = new HashSet<>();
//		중복된 자료값을 허용하지 않음
		mbti.add("1");
		mbti.add("1");
		mbti.add("2");
		mbti.add("3");
		mbti.add("4");
		mbti.add("5");

//		System.out.println(mbti);
//		System.out.println(mbti.size());
//		for(String data : mbti) {
//			System.out.println(data);
//		}

//		데이터를 가져오고 싶을 때 순서를 부여하기
//		Iterator : 순서가 없을 때 순서를 부여할 수 있는 인터페이스
		Iterator<String> iter = mbti.iterator(); //카드처럼 생각해보기?
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		ArrayList의 중복값 없애기
		ArrayList<Integer> datas = new ArrayList<>(Arrays.asList(10,20,30,40,50,10,10,10));
		datas = new ArrayList<>(new HashSet<>(datas));
		System.out.println(datas);

	}
}
