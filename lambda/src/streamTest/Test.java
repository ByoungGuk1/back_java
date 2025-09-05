package streamTest;

class A {
	public void print() {
		System.out.println("부모");
	}
}

class B extends A{
	@Override
	public void print() {
		System.out.println("자식");
	}
}

public class Test {
	public static void main(String[] args) {
		A b = new B();
		b.print();
		
	}
}






