package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
//		.sorted(): 정렬
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		numbers.stream().sorted().forEach(System.out::println);
		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		.collect(): 결과를 다양한 타입으로 리턴
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		List<Integer> newList = numbers2
				.stream().map((n) -> n * 10)
				.collect(Collectors.toList());
		
		ArrayList<Integer> newArrayList = numbers2
			.stream().map((n) -> n * 10)
			.collect(Collectors.toCollection(ArrayList::new));
		
//		문자열로 결과 타입을 변경
		String newString = numbers2
				.stream().map((n) -> n * 10)
				.map(String::valueOf)
				.collect(Collectors.joining(", "));
		
		System.out.println(newString);
		System.out.println(newList);
		
		
		
	}
}













