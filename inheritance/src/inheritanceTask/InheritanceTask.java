package inheritanceTask;

class Car {
	String brand;
	String color;
	int price;
	
	void engineStart() {
		System.out.println("열쇠 시동 켜짐");
	}
	void engineStop() {
		System.out.println("열쇠 시동 꺼짐");		
	}
	
	public Car() {;}
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
}

class SuperCar extends Car{
	String mode;
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 켜기");
	}
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끄기");
	}
	
	public SuperCar() {;}
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar();
		Car matiz = new Car();
		
		matiz.engineStart();
		ferrari.engineStop();
	}
}
