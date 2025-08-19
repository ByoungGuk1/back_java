package controlStatement;

public class EqualsTest {
	public static void main(String[] args) {
		String name = "abc";
		System.out.println(name == new String("abc"));
		System.out.println(name.equals(new String("abc")));

		// 문자열 메서드
		// .equals(): 문자열 값끼리 비교하는 메서드
		// == : 주소를 비교하는 연산자

//		System.out.println(10 == 10);
//		System.out.println('A' == 'A');
	 	System.out.println("B" == "B");
	      
		String name1 = "홍길동", name2 = "홍길동";
		System.out.println(name1 == name2);
		System.out.println(name1 == new String("홍길동"));
		System.out.println(name1.equals(new String("홍길동")));

	}
}
