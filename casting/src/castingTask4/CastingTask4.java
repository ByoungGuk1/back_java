package castingTask4;

//- 캐스팅 심화
//
//Market
//- 필드: 이름
//- 메서드:
// 1. 상품 판매
//    - 등록된 상품만 판매할 수 있다.
//    - 유저가 가진 돈보다 적으면 판매할 수 없다.
//    - 유저가 마다의 할인율이 적용된다.
//       1. 비회원 할인율 5% 적용
//       2. 멤버 할인율 30% 적용
//    - 등록된 상품의 재고보다 작으면 판매할 수 없다.

// 2. 상품 등록
//    - 상품 등록은 최대 5개까지만 할 수 있다.
//    (즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//    - 마트에 같은 이름의 상품은 등록할 수 없다.
//
// 3. 포인트 적립 메서드
//    - 비회원은 5%
//    - 회원은 10%

// 4. 만약 비회원이라면 
// 쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!

//Product 상품
//- 필드: 이름, 가격, 재고
//
//MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
// 
//MarketNonMember
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
// 
//- 마트 비회원과, 마트 회원을 객체화 시켜 물품을 구매하시오.

//	결과 확인
public class CastingTask4 {
	public static void main(String[] args) {
		Product product1 = new Product("상품 1", 5_000, 100);
		Product product2 = new Product("상품 2", 6_000, 100);
		Product product3 = new Product("상품 3", 7_000, 100);
		Product product4 = new Product("상품 4", 8_000, 100);
		Product product5 = new Product("상품 5", 9_000, 100);
		Product product6 = new Product("상품 6", 10_000, 100);
		
		Product[] newProductList = {product1, product1, product2, product3, product4, product5, product6};
		
		Member member = new Member("회원123", "010-1234-5678", 500_000);
		Member member2 = new Member("회원,돈 없음", "010-1234-5678", 0);
//		name; phone; money;
		NonMember nonMember = new NonMember("비회원12", "010-2345-6789", 1_000_000, 0 ,12);
//		String name, String phone, long money, long point, int coupon
		
		Market market = new Market("슈퍼마켓");
		
		
//		market.addProduct(product1);
//		market.addProduct(product1);
//		market.addProduct(product2);
//		market.addProduct(product3);
//		market.addProduct(product4);
//		market.addProduct(product5);
//		market.addProduct(product6);
		
		for(Product products : newProductList) {
			market.addProduct(products);
		}
		
		System.out.println();
		
		market.sellProduct(product1, member);
		System.out.println();
		market.sellProduct(product1, member2);
		System.out.println();
		market.sellProduct(product1, nonMember);
		
	}
}
