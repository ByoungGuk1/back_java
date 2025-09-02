package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask2 {
	public static void main(String[] args) {
//		a ~ z 까지 문자열로  ArrayList에 추가
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0; i <= 'z' - 'a'; i++) {
			arr.add(String.valueOf((char)('a' + i)));
		}
		
		System.out.println(arr);
		
		for(int i = 0; i < arr.size(); i++) {
			if(i % 2 == 1)	System.out.print(arr.get(i).toUpperCase());
			else	System.out.print(arr.get(i));
		}
		
	}
}
