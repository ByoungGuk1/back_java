package jsonTest;

import java.util.HashMap;

import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> myData = new HashMap<>();

		myData.put("street", "Vicor Plains");
		myData.put("suite", "Suite 879");
		myData.put("city", "Wisokyburgh");
		myData.put("zipcode", "90566-7771");
		myData.put("lat", -43.9509);
		myData.put("lng", -34.4618);
		
		JSONObject jsonData = new JSONObject(myData);
//		포맷을 바꿀 때 초깃값(생성자) 잘 활용하기
		System.out.println(jsonData);

	}
}
