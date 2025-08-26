package castingTask4;

public class Product {
//	필드 변수
	private String name;
	private int price;
	private int inventory;
//	생성자
	public Product() {;}
	public Product(String name, int price, int inventory) {
		this.name = name;
		this.price = price;
		this.inventory = inventory;
	}
//	getter,setter
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	int getInventory() {
		return inventory;
	}
	void setInventory(int inventory) {
		this.inventory = inventory;
	}
}
