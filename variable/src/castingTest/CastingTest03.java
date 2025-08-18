package castingTest;

public class CastingTest03 {
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("10") - 5);
//		ㄴ> 문자열의 강제 형변환
		System.out.println(Float.parseFloat("10") - 5);
		System.out.println(Boolean.parseBoolean("10"));

//		캐릭터 타입은 변환 메서드가 없고 글자 하나 떼오면 끝
	}
}
