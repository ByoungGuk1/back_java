package exceptTest;

public class ExceptTest {
	public static void main(String[] args) {
//		단축키 -> ALT + SHIFT + Z
		int[] arrData = new int[5];
		try {
//			arrData[5] = 10;
			System.out.println(10 / 0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 인덱스 확인");
		} catch (ArithmeticException e) {
			System.err.println("0으로 나눠서 생긴 에러");
		} catch (Exception e) {
//		항상 마지막 캐치(부모 에러 클래스이기 때문에)
			System.err.println("알 수 없는 에러 발생");
			e.printStackTrace();
		}
		System.out.println(arrData);
	}
}
