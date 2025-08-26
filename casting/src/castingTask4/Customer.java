package castingTask4;

public class Customer {
//	필드 변수
	private String name;
	private String phone;
	private long money;
	private long point;
	private int coupon;
	private double discount;
//	초기화 블록
	{
		this.setCoupon(0);
		this.setPoint(0);
		this.setDiscount(0.0);
	}
	
//	생성자
	public Customer() {;}
	public Customer(String name, String phone, long money) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
	}
	public Customer(String name, String phone, long money, int coupon) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.coupon = coupon;
	}
	public Customer(String name, String phone, long money, long point) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.point = point;
	}
	public Customer(String name, String phone, long money, long point, int coupon) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
	}
	public Customer(String name, String phone, long money, long point, int coupon, double discount) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
		this.discount = discount;
	}
	
//	getter, setter
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getPhone() {
		return phone;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	long getMoney() {
		return money;
	}
	void setMoney(long money) {
		this.money = money;
	}
	long getPoint() {
		return point;
	}
	void setPoint(long point) {
		this.point = point;
	}
	int getCoupon() {
		return coupon;
	}
	void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	double getDiscount() {
		return discount;
	}
	void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
