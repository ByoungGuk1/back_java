package collectionTest.hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<>();
		
		userMap.put("id", "userId");
		userMap.put("password", "1234");
		userMap.put("name", "이름");
		userMap.put("age", 21);
		userMap.put("isRich", true);
		
		System.out.println(userMap);
		System.out.println(userMap.get("age"));
		
		System.out.println(userMap.entrySet());
		// key = value를 한쌍으로 묶어 Entry 타입으로 만듦. 전체 구조는 Set 자료구조
		
		Iterator<Entry<String, Object>> userMapIter = userMap.entrySet().iterator();
		System.out.println(userMapIter);
		
	}
}
