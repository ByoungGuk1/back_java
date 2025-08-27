package marker;

public class Tiger extends Animal implements CarnivoreMarker{

	public Tiger() {
		super();
	}
	public Tiger(String name) {
		super(name);
	}	
	public Tiger(String name, int age, String food) {
		super(name, age, food);
	}	
}
