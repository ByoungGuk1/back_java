package methodTest;

import java.util.Scanner;

public class MethodTask2 {
//	1. 이름을 10번 출력해주는 메서드
	void printName10times(String name) {
		for(int i = 0; i < 10; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask2 mt = new MethodTask2();
		String name = "";
		
		System.out.println("이름 입력");
		name = sc.nextLine();
		sc.close();
		
		mt.printName10times(name);
	}
	
}
