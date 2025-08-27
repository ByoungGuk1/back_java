package innerTest;

public class InnerTest {
	public class Test {
		int value;

		public Test() {
			this.value = 20;
		}
		
		public void printValue() {
			System.out.println(this.value);
		}
	}
	public static void main(String[] args) {
		InnerTest it = new InnerTest();
		it.new Test().printValue();
	}
}
