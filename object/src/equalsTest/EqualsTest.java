package equalsTest;

public class EqualsTest {
	public static void main(String[] args) {
		String data1 = "abcd";
		String data2 = "abcd";
		String data3 = new String("abcd");
		String data4 = new String("abcd");
		
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		System.out.println(data3.hashCode());
		System.out.println(data4.hashCode());
		System.out.println(data1 == data2);
		System.out.println(data1 == data3);
		System.out.println(data2 == data4);
	}
}
