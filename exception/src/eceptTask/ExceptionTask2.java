package eceptTask;

import java.util.Scanner;

public class ExceptionTask2 {
//	사용자에게 입력을 받았을 때 특수문자 중 !@#을 사용하면 오류를 발생시키는 로직
//	만든 예외를 이용해서 메세지를 출력
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputMessage = null;
		SymbolInter si = (String str)->{
			boolean check = false;
			String[] symbols = {"!", "@", "#"};
			for(String symbol : symbols) {
				check = str.contains(symbol);
				if(check)	break;
			}
			return check;
		};
		
		while(true) {
			System.out.println("보낼 메세지 입력");
			inputMessage = sc.nextLine();
			
			try {
				if(si.symbolInter(inputMessage)) {
					throw new SpecialCharacterException("특수문자 사용");
				}
				else {
					System.out.println(inputMessage + "\n");
				}
			} catch (SpecialCharacterException e) {
				System.err.println("특수문자");
				System.err.println(e.getMessage() + "\n");
			}
			
		}
		
	}
}
