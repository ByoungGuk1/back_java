package castingTask4;

public class NonMember extends Customer {
//초기화 블록
{
	super.setDiscount(5);
}
//생성자
	public NonMember() {;}
	public NonMember(String name, String phone, long money) {
		super(name, phone, money);
	}
	public NonMember(String name, String phone, long money, int coupon) {
		super(name, phone, money, coupon);
	}
	public NonMember(String name, String phone, long money, long point) {
		super(name, phone, money, point);
	}
	public NonMember(String name, String phone, long money, long point, int coupon) {
		super(name, phone, money, point, coupon);
	}
}
