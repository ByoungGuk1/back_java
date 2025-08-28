package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
		LambdaInter lambdaInter1_1 = new LambdaInter() {
			
			@Override
			public void printAddNum(int num1, int num2) {
				System.out.println(num1 + num2);
			}
		};

		LambdaInter lambdaInter1_2 = (num1, num2) -> {System.out.println(num1 + num2);};
		
		lambdaInter1_1.printAddNum(2, 3);
		lambdaInter1_2.printAddNum(2, 3);
		
//		----
		
		LambdaInter2 lambdaInter2_1 = (int num1, int num2) -> new CalcResult();
		LambdaInter2 lambdaInter2_2 = (int num1, int num2) -> { return new CalcResult(); };
//		중괄호를 생략하면 통째로가 리턴 값
		
		LambdaInter3 lambdaInter3_1 = num -> num % 2 == 0;
//		매개변수가 하나일 때 소괄호를 생략 가능
		
	}
}
