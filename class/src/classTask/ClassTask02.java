package classTask;

class Market {
//	변수 : 상품명, 상품가격, 상품재고
//	기능 : 판매(sell)
	String productName;
	int productPrice;
	int productCount;
	void sellProduct(int productCount, Customer customer) {
		int sellingPrice = (int)(productCount * (this.productPrice * (100 - customer.discount) / 100));
		if(customer.money < sellingPrice) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.productCount -= productCount;
		customer.money -= sellingPrice;
	}
	
	public Market() {;}
	public Market(String productName, int productPrice, int productCount) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCount = productCount;
	}
	
}
class Customer {	// discount는 n%
//	이름, 핸드폰, 돈, 할인율
	String name;
	String phone;
	long money;
	double discount;
	
	{	//초기화 블록
		money = 0;
		discount = 0.0;
	}
	
	public Customer() {;}
	public Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public Customer(String name, String phone, long money) {
		this.name = name;
		this.phone = phone;
		this.money = money;
	}
	public Customer(String name, String phone, long money, double discount) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.discount = discount;
	}

}

public class ClassTask02 {
	public static void main(String[] args) {
//		마켓, 소비자를 객체화
		Market superMarket = new Market("과자",5000,500);
		Customer user1 = new Customer("홍길동", "010-1234-5678", 50000, 20);
//		소비자에게 마켓의 물건을 판매
		superMarket.sellProduct(20, user1);
//		마켓의 상품 재고와 소비자의 남은 금액을 출력
		System.out.printf("마켓의 상품 재고는 %d개 이며, %s님의 남은 금액은 %d원입니다.\n", superMarket.productCount, user1.name, user1.money);
	}
}
