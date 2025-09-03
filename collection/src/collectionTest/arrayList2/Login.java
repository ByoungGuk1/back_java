package collectionTest.arrayList2;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		UserField field = new UserField();
		Scanner sc = new Scanner(System.in);
		
//		회원가입
		User user1 = new User("admin", "관리자 계정", "1234", "010-1234-5678");

//	1. 회원가입
		field.signUp(user1);
		System.out.println(DBConnecter.users);

//	2. 로그인하기
		User userinput = new User("admin", "", "1234", "");
		System.out.println("로그인 결과 : " + field.login(userinput));
		System.out.println("세션 : " + UserField.userId);

//	3. 비밀번호 변경
		System.out.println("비밀번호 변경하기");
		User editUser = new User();
		editUser.setPassword(sc.nextLine());
		field.updateUser(editUser);
		System.out.println(user1);

//	4. 로그아웃하기
		field.logout();
		System.out.println("로그아웃 완료");
		System.out.println("세션 : " + UserField.userId);

		sc.close();
	}
}
