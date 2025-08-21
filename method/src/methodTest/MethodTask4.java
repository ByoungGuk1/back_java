package methodTest;

import java.util.Scanner;

public class MethodTask4 {
//	사용자에게 이름과 반복 횟수를 받아서 반복 횟수만큼 이름을 출력해주는 메서드
	void printNameNTimes(String name, int runtime) {
		for(int i = 0; i < runtime; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		MethodTask4 mt = new MethodTask4();
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		int number = 0;
		
		System.out.println("이름 입력");
		name = sc.next();
		System.out.println("반복 횟수 입력\nex)5");
		number = sc.nextInt();
		
		sc.close();
		
		mt.printNameNTimes(name, number);
	}
}
