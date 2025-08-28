package lambdaTask;

import lambdaTest.LambdaInter2;
import lambdaTest.CalcResult;

public class LambdaTask {
//사칙연산의 결과를 출력하는 메서드
	public void showCalcResult(CalcResult result) {
		System.out.println("더하기의 결과는 " + result.getAdd());
		System.out.println("빼기의 결과는 " + result.getMinus());
		System.out.println("곱하기의 결과는 " + result.getMulti());
		System.out.println("나누기의 결과는 " + result.getDiv());
	}	
	
//	LambdaInter2 구현
//	두 정수를 받아서 사칙연산을 CalcResult 로 리턴
	public static void main(String[] args) {
		CalcResult result = null;
		LambdaInter2 lambda = (num1, num2) -> {
			CalcResult result2 = new CalcResult();
			result2.setAdd(num1 + num2);
			result2.setMinus(num1 - num2);
			result2.setMulti(num1 * num2);
			result2.setDiv((double)num1 / num2);
			return result2;
			};
			
			result = lambda.calc(2, 3);
			new LambdaTask().showCalcResult(result);
	}
}
