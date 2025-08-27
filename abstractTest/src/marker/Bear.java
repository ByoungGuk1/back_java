package marker;

public class Bear extends Animal implements CarnivoreMarker{

	public Bear() {
		super();
	}
	public Bear(String name) {
		super(name);
	}	
	public Bear(String name, int age, String food) {
		super(name, age, food);
	}	
}
