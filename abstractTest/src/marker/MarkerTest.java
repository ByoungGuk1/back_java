package marker;

public class MarkerTest {
//	어떤 동물이 어떤 분류인지 알려주는 메서드
//	초식 동물 -> 초식동물
//	육식 동물 -> 육식동물
//	아니라면 잡식동물
	public void checkKind(Animal animal) {
		if (animal instanceof HerviboreMarker) {
			System.out.println(animal.name + "은 초식동물");
		} else if (animal instanceof CarnivoreMarker) {
			System.out.println(animal.name + "은 육식동물");
		} else {
			System.out.println(animal.name + "은 잡식동물");
		}
	}
	public void checkKinds(Animal[] animals) {
		for(Animal animal : animals) {
			this.checkKind(animal);
		}
	}
	
	public static void main(String[] args) {
		MarkerTest mk = new MarkerTest();
		Animal[] animals = {
				new Dog("Dog"),
				new Cat("Cat"),
				new Cow("Cow"),
				new Rabbit("Rabbit"),
				new Bear("Bear"),
				new Tiger("Tiger"),
		};
		mk.checkKinds(animals);
	}
}
