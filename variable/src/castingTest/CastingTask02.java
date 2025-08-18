package castingTest;

public class CastingTask02 {
	public static void main(String[] args) {
//		1 + "8.24" + "7.8" 두 값을 더해서 115 만들기
		int num1 = 0, intNum2 = 0, intNum3 = 0;
		double doubleNum2 = 0.0, doubleNum3 = 0.0;
		String stringNum1 = "", num2 = "" , num3 = "", result = "";
		
		num1 = 1;
		num2 = "8.24";
		num3 = "7.8";
		
		stringNum1 = String.valueOf(num1);
		
		doubleNum2 = Double.parseDouble(num2);
		doubleNum3 = Double.parseDouble(num3);
		
		intNum2 = (int)doubleNum2;
		intNum3 = (int)doubleNum3;
		
		result = stringNum1 + (intNum2 + intNum3);
		
		System.out.println(result);
	}
}
