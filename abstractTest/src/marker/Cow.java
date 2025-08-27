package marker;

public class Cow extends Animal implements HerviboreMarker{

	public Cow() {
		super();
	}
	public Cow(String name) {
		super(name);
	}	
	public Cow(String name, int age, String food) {
		super(name, age, food);
	}	
}
