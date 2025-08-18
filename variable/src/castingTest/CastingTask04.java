package castingTest;

public class CastingTask04 {
	public static void main(String[] args) {
//      "12.123";
//      "345.789"
//      "6789"
//      3개 값을 더해서 123456789를 출력하기
		final String num1 = "12.123", num2 = "345.789", num3 = "6789";
		int intNum1 = 0, intNum2 = 0, result = 0;
		String stringNum1 = "", stringNum2 = "", stringNum3 = "";
		
		intNum1 = (int)Double.parseDouble(num1);
		intNum2 = (int)Double.parseDouble(num2);
		
		stringNum1 = String.valueOf(intNum1);
		stringNum2 = String.valueOf(intNum2);
		
		stringNum3 = num3;
		
		result = Integer.parseInt(stringNum1 + stringNum2 + stringNum3);
		
		System.out.println(result);
	}
}
