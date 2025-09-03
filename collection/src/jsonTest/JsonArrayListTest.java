package jsonTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArrayListTest {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		
		JSONArray usersJson = new JSONArray();
		JSONObject userJson = new JSONObject();
		
		User user1 = new User(1L, "홍길동", 20, "개발자");
		User user2 = new User(2L, "장보고", 22, "기획자");
		User user3 = new User(3L, "이순신", 23, "디자이너");
		User user4 = new User(4L, "이성계", 24, "개발자");

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);

		System.out.println(users);
		
		for(int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
			userJson = new JSONObject(users.get(i));
			System.out.println(userJson);
			usersJson.put(userJson);
		}
		
//		users.stream().map((data)-> new JSONObject(data)).forEach((jsonObj)->{
//			usersJson.put(jsonObj);
//		});
		
		System.out.println(usersJson);

	}
}
