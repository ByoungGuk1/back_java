package marker;

public class Animal {
//	이름, 나이, 먹이
	String name;
	int age;
	String food;
	
	public Animal() {;}
	public Animal(String name) {
		this.name = name;
	}
	public Animal(String name, int age, String food) {
		this.name = name;
		this.age = age;
		this.food = food;
	}
}
