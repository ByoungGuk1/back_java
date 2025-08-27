package anonymousTask;

public class MathField {
	public static void main(String[] args) {
		MathTask mt = new MathTask() {
			@Override
			public void printName(String name) {
				System.out.println(name);
			}
			@Override
			public String concat(String str1, String str2) {
				return str1 + str2;
			}
			@Override
			public CalcResult calc(int num1, int num2) {
				CalcResult result = new CalcResult();
				result.setSum(num1 + num2);
				result.setMinus(num1 - num2);
				result.setMultiply(num1 * num2);
				result.setDiv((double)num1 / num2);
				return result;
			}
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		System.out.println("fn : printName");
		mt.printName("name");
		System.out.println();
		
		System.out.println("fn : concat");
		System.out.println(mt.concat("ab", "cd"));
		System.out.println();
		
		System.out.println("fn : calc");
		System.out.println(mt.calc(5, 2).getSum());
		System.out.println(mt.calc(5, 2).getMinus());
		System.out.println(mt.calc(5, 2).getMultiply());
		System.out.println(mt.calc(5, 2).getDiv());
		System.out.println();
		
		System.out.println("fn : add");
		System.out.println(mt.add(2, 3));
		
	}
}
