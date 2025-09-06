package streamTask;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 {
	
	public boolean isOdd(int num) {
		return num % 2 == 1;
	}
	
	public static void main(String[] args) {
//		IntStream 으로 시작
//		10,30,50,70,90만 ArrayList에 추가
		List<Integer> Li = null;
		StreamTask3 st = new StreamTask3();
		
		Li = IntStream
				.range(1, 10)
				//:<IntStream>
				.filter(st::isOdd)	//.filter(new StreamTask3()::isOdd)
				//:<IntStream>
				.map(n -> n * 10)
				//:<IntStream>
				.boxed()	//.mapToObj(Integer :: valueOf)
				//:<Stream<Integer>>
				.collect(Collectors.toList());	//.collect(Collectors.toCollection(ArrayList::new));
				//:<List<Integer>>
		
		Li.forEach(System.out::println);
	}
}
