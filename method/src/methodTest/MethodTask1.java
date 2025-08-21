package methodTest;

public class MethodTask1 {
	
//	1. 1~10까지 출력해주는 메서드
	void printOneToTen() {
		System.out.println("printOneToTen");
		for(int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
		}
	}
	
//	2. 1번 메서드 사용
	void startPrintOneToTen() {
		System.out.println("startPrintOneToTen" + "");
		new MethodTask1().printOneToTen();
	}
	
	public static void main(String[] args) {
		MethodTask1 mt = new MethodTask1();
		mt.startPrintOneToTen();
	}
	
}
