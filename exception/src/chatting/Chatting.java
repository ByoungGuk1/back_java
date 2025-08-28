package chatting;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		while(true){
			System.out.println("보낼 메세지");
			message = sc.nextLine();
			
			try {
				if(message.contains("dd")) {
					throw new BadWordException("금지어");
				}	else {
					System.out.println(message);			
				}
			} catch (BadWordException e) {
				System.err.println("비속어 사용 금지");
				System.err.println(e.getMessage());
				System.err.println(e.getClass());
			}
		}
		
	}
}
