package collectionTest.arrayList2;

import java.util.ArrayList;

public class UserField {
	//		DataBase
	final int KEY = 50000;
	public ArrayList<User> users = DBConnecter.users;

	//		Session
	public static String userId;

	//		아이디 검사
	public User checkId(String id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	//		회원가입
	public void signUp(User user) {
		User userDataBase = checkId(user.getId());
		if(userDataBase == null) {
			users.add(user);
		}
	}
	
	//		로그인
//	id와 pw를 받고
//	우선적으로 id를 확인 -> 있으면 유저의 데이터 전체 / 없다면 null
//	유저의 데이터가 있다면, 위에서 가져온 유저의 데이터 중 pw와 입력된 pw의 값을 검사
//	pw가 동일하다면 user반환 / 아니라면 null
//	추후 user의 데이터를 활용하여 이름 등 표시에 사용
	public boolean login(User user) {
		User dbUser = checkId(user.getId());
		if(dbUser != null && dbUser.getPassword().equals(user.getPassword())) {
			userId = user.getId();
			return true;
		}
		return false;
	}

	//		로그아웃
//	현재 가지고 있는 유저의 데이터를 null로 지움
//	null로 변경하여 로그인 되기 전의 상태로 초기화
	public void logout() {
		userId = null;
	}

	//		암호화
	public String encrypt(String pw) {
		String result = "";
		for(char data : pw.toCharArray()) {
			result += (char)(data * KEY);
		}
		return result;
	}

	//		비밀번호 변경 - 마이페이지

	//		비밀번호 변경 - 비밀번호 변경 30일

	//		인증번호 전송

	//		인증번호 생성

	//		인증번호 확인
	public static void main(String[] args) {
		User user1 = new User("admin", "관리자 계정", "1234", "010-1234-5678");
		UserField field = new UserField();
		
		System.out.println(field.checkId(user1.getId()));
		
//		1. 회원가입
		field.signUp(user1);
//		2. 로그인하기
		System.out.println("로그인 결과 : " + field.login(user1));
		System.out.println("세션 : " + userId);
//		3. 로그아웃하기
		field.logout();
		System.out.println("로그아웃 완료");
		System.out.println("세션 : " + userId);
		
//		암호화?
		System.out.println(field.encrypt("1234"));
	}
}
