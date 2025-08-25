package classTask;

//1. 2개의 값을 전달하면 최솟값과 최댓값을 구해주는 메서드
//2. 클래스로 리턴
//3. 메인 메서드에서 메서드 사용

class NumberObject {
	int min;
	int max;
	
	public NumberObject() {;}
	public NumberObject(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	NumberObject calMinMax() {
		NumberObject numbers = new NumberObject(min, max);
		int tmp = 0;
		if(numbers.min > numbers.max) {
			tmp = numbers.min;
			numbers.min = numbers.max;
			numbers.max = tmp;
			this.min = numbers.min;
			this.max = numbers.max;
		}
		return numbers;
	}
	
}

public class ClassTask3 {
	public static void main(String[] args) {
		NumberObject numbers = new NumberObject(5, 2);
		NumberObject result = numbers.calMinMax();
		
		System.out.println(result.min);
		System.out.println(result.max);
		System.out.println(numbers.min);
		System.out.println(numbers.max);
	}
}

//---

//package classTask;
//
//public class Result {
//  int min;
//  int max;
//  
//  public Result() {;}
//  public Result(int min, int max) {
//     this.min = min;
//     this.max = max;
//  }
//}
//  
////1. 2개의 값을 전달하면 최솟값과 최댓값을 구해주는 메서드
////2. 클래스로 리턴
////3. 메인 메서드에서 메서드 사용
//public class ClassTask3 {
//Result getMaxAndMin(int[] arData) {
//   Result result = new Result(arData[0], arData[0]);
//   for(int i = 0; i < arData.length; i++) {
//      if(result.min > arData[i]) { result.min = arData[i]; };
//      if(result.max < arData[i]) { result.max = arData[i]; };
//   }
//   return result;
//}
//
//public static void main(String[] args) {
//   ClassTask3 ct3 = new ClassTask3();
//   int[] arData = {1, 3, 5, 9, 0};
//   Result result = ct3.getMaxAndMin(arData);
//   System.out.println(result.min);
//   System.out.println(result.max);
//}
//
//}
