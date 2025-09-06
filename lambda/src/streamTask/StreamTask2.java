package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask2 {
	public static void main(String[] args) {
//  1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		ArrayList<Integer> intArrList1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
		Integer sum = 0;
		for(Integer data : intArrList1) {
			sum += data;
		}
		System.out.println(sum);
		
//		Stream<T>
		ArrayList<Integer> intArrList2 = new ArrayList<>();
//		IntStream -> 기본 정수타입을 가지고 연산
		intArrList2 = IntStream
				.rangeClosed(1, 6)	//:<IntStream>
				.map(n -> n * 10)	//:<IntStream>
				.mapToObj((data)->Integer.valueOf(data))	//:<Stream<Integer>>
				.collect(Collectors.toCollection(ArrayList::new));	//:<ArrayList<Integer>>

//		mapToObj() -> IntStream -> Stream<T>
		
//		Stream<T> -> mapToInt ==> IntStream
		IntStream a = intArrList2	//:<ArrayList<Integer>>
				.stream()	//:<Stream<Integer>>
				.mapToInt(Integer::intValue);	//:<IntStream>

		System.out.println(a);
		sum = a.sum();	//int
		System.out.println(sum);
	}
}
