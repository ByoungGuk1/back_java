package inheritanceTest;

//	부모 클래스
class A{
	String name;
	int data;
	void printName() {
		System.out.println(name);
	}
	void walk() {
		System.out.println("네발로 걷기");
	}
	
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name = "A";
		this.data = 10;
	}
}

//	자식 클래스
class B extends A{
//	B클래스에서 A클래스 만큼 확장 -> A를 가져오기(A를 상속) ===> A + 알파
	void printData() {
		System.out.println(data);
		System.out.println(this.data);
		System.out.println(super.data);
	}
	@Override
//	오버라이딩 될 때 / 어노테이션(@)으로 표시
	void walk() {
//		오버라이딩 -> 부모 메서드와 자식 메서드의 이름과 매개변수가 동일할때 정의하는 것
//		부모 메서드 자리에 자식 메서드가 덮어쓰기 되어 부모 메서드는 사라지고 자식 메서드가 자리를 차지
		super.walk();
		System.out.println("두발로 걷기");
	}
	
	public B() {
		super();
//		부모의 생성자를 가져옴.
//		super -> 부모를 호출하는 키워드
		System.out.println(this);
		System.out.println("자식 생성자 호출");
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		b.printName();
		b.printData();
		a.walk();
		b.walk();
	}
}
