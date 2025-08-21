package methodTest;

import java.util.Scanner;

public class MethodTask3 {
	void printOneToN(int number) {
		for(int i = 0; i < number; i++) {
			if(i == number - 1) System.out.println(i + 1);
			else System.out.print(i + 1 + " ");
		}
	}
	
	public static void main(String[] args) {
		MethodTask3 mt = new MethodTask3();
		Scanner sc = new Scanner(System.in);
		int runTime = 0;
		
		System.out.println("횟수 입력");
		runTime = sc.nextInt();
		sc.close();
		
		mt.printOneToN(runTime);
	}
}
