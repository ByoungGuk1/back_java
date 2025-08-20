package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arrData1 = {1, 2, 3, 4};
		int[] arrData2 = new int[5];
		int[] arrData3 = null;
//		null => 주소의 초기값;
		
		System.out.println(arrData1[0]);
		System.out.println();
		System.out.println(arrData2[0]);
		System.out.println();
		System.out.println(arrData3);
		System.out.println();
		
		for(int i = 0; i < arrData1.length; i++) {
			System.out.println(arrData1[i]);
		}
	}
}
