package castingTask4;

public class Member extends Customer {
//	초기화 블록
	{
		super.setDiscount(30);
	}
	
//생성자
	public Member() {;}
	public Member(String name, String phone, long money) {
		super(name, phone, money);
	}
	public Member(String name, String phone, long money, int coupon) {
		super(name, phone, money, coupon);
	}
	public Member(String name, String phone, long money, long point) {
		super(name, phone, money, point);
	}
	public Member(String name, String phone, long money, long point, int coupon) {
		super(name, phone, money, point, coupon);
	}
}
