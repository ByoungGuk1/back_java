package castingTest;

public class CastingTest {
	public static void main(String[] args) {
		System.out.println(1 + 2.5);
//		ㄴ> 정수 + 실수 = 실수 -> 자동 형변환
		
		System.out.println(5 + 3);
//		ㄴ> 정수 + 정수 = 정수
		System.out.println(5 / 2);
//		ㄴ> 정수 + 정수 = 정수 -> 즉, 2가 나옴.
		
		System.out.println((double)5 / 2);
//		ㄴ> 강제 형변환
		System.out.println((int)((double)5 / 2));
	}
}
