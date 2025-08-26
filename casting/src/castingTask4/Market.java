package castingTask4;

public class Market {
//	--- 필드 변수 ---
	private String Name;
	private Product[] productList;
//	--- 초기화 블록 ---
	{
		productList = new Product[5];
	}
// --- 생성자 ---
	public Market() {;}
	public Market(String name) {
		Name = name;
	}
// --- getter, setter ---
	String getName() {
		return Name;
	}
	void setName(String name) {
		Name = name;
	}
	Product[] getProductList() {
		return productList;
	}
	void setProductList(Product[] productList) {
		this.productList = productList;
	}
// --- 필드 메서드 ---
	public void sellProduct(Product product, Customer customer) {
		boolean isExistence = false, isLowMoney = false;
		long sellingPrice = 0L;
		
//		조건 1 : 없는 상품일 경우 정지
		isExistence = true;
		for(Product products : this.productList) {
			if(products.getName().equals(product.getName())) {
				isExistence = true;
				break;
			}
		}
		if(!isExistence) {
			System.err.println("없는 상품입니다.");
			return;
		}
//		조건 2 : 구매자의 잔고가 부족할 경우 정지
		sellingPrice = (long)(product.getPrice() * ((100 - customer.getDiscount()) / 100 ));
		if(customer.getMoney() < sellingPrice) {
			isLowMoney = true;
		}

//	실행문 :
		if(customer.getCoupon() >= 10) {
			for(int i = 0; i < this.productList.length; i++) {
				if(this.productList[i].getName().equals(product.getName())) {
					this.productList[i].setInventory(this.productList[i].getInventory() - 1);
					customer.setCoupon(customer.getCoupon() - 10);
					System.out.println("쿠폰으로 구매 완료");
					System.out.println(customer.getName() + "님");
					System.out.println("남은 쿠폰은 " + customer.getCoupon() + "장 입니다.");
					System.out.println(this.productList[i].getName() + "의 남은 재고는 " + this.productList[i].getInventory() + "입니다.");
				}
			}
		} else if(!isLowMoney){
			for(int i = 0; i < this.productList.length; i++) {
				if(this.productList[i].getName().equals(product.getName())) {
					this.productList[i].setInventory(this.productList[i].getInventory() - 1);
					customer.setMoney(customer.getMoney() - sellingPrice);
					System.out.println("현금으로 구매 완료");
					this.giveCoupon(customer);
					System.out.println(customer.getName() + "님");
					System.out.println("남은 금액은 " + customer.getMoney() + "입니다.");
					this.earnPoints(customer, sellingPrice);
					System.out.println(this.productList[i].getName() + "의 남은 재고는 " + this.productList[i].getInventory() + "입니다.");
				}
			}
		} else {
			System.err.println(customer.getName() + "님 잔액이 부족합니다.");
		}
	}
	public void addProduct(Product product) {
//		조건 1 : 동일한 상품이 있는 경우 추가하지 않음.
		boolean isSame = false;
		for(int i = 0; i < this.productList.length; i++) {
			if(this.productList[i] != null && this.productList[i].getName().equals(product.getName())) {
				isSame = true;
				break;
			}
		}
		if(isSame) {
			System.err.println("이미 있는 상품입니다.");
			return;
		}
//		실행문 : 최대 5개까지만 등록.
		for(int i = 0; i < this.productList.length; i++) {
			if(this.productList[i] == null) {
				this.productList[i] = product;
				System.out.println("상품 " + this.productList[i].getName() + "이 " + this.productList[i].getInventory() + "개 추가되었습니다.");
				return;
			}
		}
		System.err.println("최대 5개까지만 등록 가능합니다.");
	}
	public void earnPoints(Customer customer, long expenditure) {
		if(customer instanceof Member) {
			customer.setPoint(expenditure * 10 / 100);
			System.out.println(expenditure * 10 / 100 + " 포인트가 적립되었습니다.");
		}else if(customer instanceof NonMember) {
			customer.setPoint(expenditure * 5 / 100);
			System.out.println(expenditure * 5 / 100 + " 포인트가 적립되었습니다.");
		}else {
			System.err.println("회원 정보 오류");
			return;
		}
	}
	public void giveCoupon(Customer customer) {
		if(customer instanceof Member) {
			System.out.println("회원은 쿠폰이 없습니다.");
		}else if(customer instanceof NonMember) {
			customer.setCoupon(customer.getCoupon() + 1);
			System.out.println("쿠폰 한장이 적립되었습니다.");
			System.out.printf("남은 쿠폰은 총 %d장 입니다.\n", customer.getCoupon());
		}else {
			System.err.println("회원 정보 오류");
			return;
		}
		
	}
}
