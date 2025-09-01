package objectTask;

// 상품 클래스를 만들고
// toString, hashCode, Equals를 재정의 후
// 같은 상품인지 비교
// 1번 상품
//	name : 파인애플
//	price : 20000
//	stock : 15
//	mou : Pilipinas

public class ObjectTask1 {
	
	public static void main(String[] args) {
		Fruits pineapple = new PineApple(1, "pineapple", 20000, 15, "Pilipinas");
		Fruits pineapple2 = new PineApple(2, "pineapple", 15000, 15, "Pilipinas");
		Fruits apple = new Apple(1, "apple", 10000, 10, "Cheongsong");
		
		System.out.println(pineapple.equals(apple));
		System.out.println(pineapple.equals(pineapple2));
	}
	
}
