package formatTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "";
		int age = 0;
		double height = 0;
		
		name = "송병국";
		age = 27;
		height = 169.9;
		
		System.out.printf("이름 : %s \n", name);
		System.out.printf("나이 : %d \n", age);
		System.out.printf("키 : %.1f", height);
	}
}
