package collectionTest.hashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map.Entry;
//import java.util.Set;

//---Quest---
//HashMap 자료구조
//"street": "Victor Plains",
//"suite": "Suite 879",
//"city": "Wisokyburgh",
//"zipcode": "90566-7771",
//"lat": "-43.9509",
//"lng": "-34.4618"
//---

//	value들 만 arrayList로 변경 후 출력

public class HashMapTask1 {
	public static void main(String[] args) {
		HashMap<String, Object> myData = new HashMap<>();

		myData.put("street", "Vicor Plains");
		myData.put("suite", "Suite 879");
		myData.put("city", "Wisokyburgh");
		myData.put("zipcode", "90566-7771");
		myData.put("lat", -43.9509);
		myData.put("lng", -34.4618);

//		Set<Entry<String, Object>> entrySetTypeMyData =  myData.entrySet();
//		Iterator<Entry<String, Object>> iterMyData = entrySetTypeMyData.iterator();
//		List<Object>	entryListTypeMyData = new ArrayList<>();
//
//		while(iterMyData.hasNext()) {
//			entryListTypeMyData.add(iterMyData.next().getValue());
//		}
//
//		System.out.println(entryListTypeMyData);
		
		ArrayList<Object> datas = new ArrayList<>(myData.values());

		System.out.println(datas);

	}
}
