package objectTask;

import java.util.Objects;

public class Fruits {
	private int id;
	private String name;
	private int price;
	private int stock;
	private String mou;
	
	public Fruits() {;}
	public Fruits(int id, String name, int price, int stock, String mou) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.mou = mou;
	}
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
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
	int getStock() {
		return stock;
	}
	void setStock(int stock) {
		this.stock = stock;
	}
	String getMou() {
		return mou;
	}
	void setMou(String mou) {
		this.mou = mou;
	}
	
	@Override
	public String toString() {
		return "ObjectTask1 [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + ", mou=" + mou + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruits other = (Fruits) obj;
		return id == other.id;
	}

}
