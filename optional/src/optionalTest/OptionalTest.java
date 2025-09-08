package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	
	ArrayList<User> users = new ArrayList<>(Arrays.asList(
			new User("관리자 계정", "admin", "1234"),
			new User("홍길동", "hgd", "1234"),
			new User("이순신", "lss", "1234"),
			new User("장보고", "jbg", "1234")
			));
	
//	if문에 한 번이라도 들어가지 않았다면 null이 리턴 -> NPE(NullPointerException) 발생
//	***** 강조 : 반드시 리턴 타입에만 Optional을 사용하고, 단일 객체만 감싼다.
//	나쁜예) Optional<List<User>> -> ?????
//	좋은예) Optional<List<User>> -> ?????
	public Optional<User> findById(Long id) {
		User user = null;
		for(User userInDb : users) {
			if (userInDb.getId() == id) {
				System.out.println(userInDb);
				user = userInDb;
			}
		}
		return Optional.ofNullable(user);
	}

	public static void main(String[] args) {
		OptionalTest optionalTest = new OptionalTest();
		
//		User user = optionalTest.findById(200L);
//		System.out.println(user.getUserName());

		Optional<User> foundUser = optionalTest.findById(200L);
		User user = null;
//		값이 있으면 값을 주고, 값이 없다면 통째로 throw
//		유저가 null 이 아니면 통째로가 user
//		null 이라면 throw
		try {
			user = foundUser.orElseThrow(()->{
				throw new NoSearchUserException("유저를 찾을 수 없습니다.");
			});
			System.out.println(user.getUserName());
		} catch (NoSearchUserException e) {
			System.out.println("유저를 찾을 수 없음.");
		}
		
//		.isPresent() : 값이 있으면 true 없으면 false
		foundUser.map(User::getUserName).isPresent();
		
//		.ifPresent(() -> {}) : 앞의 결과가 있을때엔 매개로직 수행
		optionalTest.findById(100L).map(User::getUserEmail).ifPresent((email)->{
			System.out.println(email);
		});
		
		optionalTest.findById(100L).map(User::getUserEmail).ifPresentOrElse((email) -> {
//			값이 있는경우 해당 로직 수행
			System.out.println(email);
			foundUser.get();
//			성공한 경우로, 해당 객체 가져오기 가능.
		}, () -> {
//			값이 없는경우 해당 로직 수행 : 실패로 인한 매개변수는 없음
			System.out.println("값이 없음");
		});

	}
}
