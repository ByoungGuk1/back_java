package collection;

import java.util.ArrayList;

public class ArrayListTest<T> {
//	<?> : 제네릭 문법 - 포괄적인.. 즉 이름이 없는.. 이라는 뜻
//	지금 당장 무슨 타입일지 알 수 없을 때 사용하는 타입
//	사용자가 어떤 타입의 데이터를 넣을 지 모르기에 객체화할 때 타입을 결정
//	T -> type의 약자, '클래스'로만 작성.
	
	
//	toString() 이 재정의 된 상태 // equals() 빼고
	
	T data;
	
	public static void main(String[] args) {
		ArrayList<String> datas = new ArrayList<>();
		datas.add("!!");
		System.out.println(datas);
		ArrayList<Integer> datas2 = new ArrayList<>();
		datas2.add(2);
		System.out.println(datas2);
		ArrayList datas3 = new ArrayList<>();	//안쓰면 object로 업캐스팅
		datas3.add(2);
		System.out.println(datas3);
		
	}
}
