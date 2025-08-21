package methodTest;

public class MethodTest {
//	3개의 정수를 받아서 모두 뺀 값을 반환하는 함수
	int minusThreeNum(int num1, int num2, int num3) {
				return num1 - num2 - num3;
	}
	
//	성과 이름을 붙여서 출ㄹ력
	void printFullName(String lastName, String firstName) {
		System.out.println(lastName + firstName);
	}
	
	
	public static void main(String[] args) {
		MethodTest.printFullName("가","나다");
	}
}
