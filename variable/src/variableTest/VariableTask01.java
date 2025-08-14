package variableTest;

//실습
//각 데이터에 맞는 타입 선언 후 출력해보기
//5, false, 7845.15, B, 85.10F, 자바, S, 98590, D, true, 107L 공백문자

public class VariableTask01 {
	public static void main(String[] args) {
		boolean answer2 = false, answer10 = false;
		int answer1 = 0, answer8 = 0;
		long answer11 = 0L;
		float answer5 = 0.0F;
		double answer3 = 0.0;
		char answer4 = ' ', answer7 = ' ', answer9 = ' ', answer12 = ' ';
		String answer6 = "";
		
		answer1 = 5;
//		answer2 = false;
		answer3 = 7845.15;
		answer4 = 'B';
		answer5 = 85.10F;
		answer6 = "자바";
		answer7 = 'S';
		answer8 = 98590;
		answer9 = 'D';
		answer10 = true;
		answer11 = 107L;
//		answer12 = ' ';
		
		System.out.print(answer1+", ");
		System.out.print(answer2+", ");
		System.out.print(answer3+", ");
		System.out.print(answer4+", ");
		System.out.print(answer5+", ");
		System.out.print(answer6+", ");
		System.out.print(answer7+", ");
		System.out.print(answer8+", ");
		System.out.print(answer9+", ");
		System.out.print(answer10+", ");
		System.out.print(answer11+", ");
		System.out.print(answer12);
		
	}
}
