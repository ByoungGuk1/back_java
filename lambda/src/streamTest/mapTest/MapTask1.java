package streamTest.mapTest;

import java.util.ArrayList;
import java.util.Arrays;

public class MapTask1 {
	
	public String addRoot(String url) {
		return "/app" + url;
	}
	
	public static void main(String[] args) {
//		아래의 4개의 URL을 List에 담은 후 모든 경로 앞에 /app을 붙여서 출력하기
//		/news, /game, /brand, /rank
		ArrayList<String> urls = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		
		MapTask1 mt = new MapTask1();
		urls.stream().map(mt::addRoot).forEach(System.out::println);
		
	}
}








