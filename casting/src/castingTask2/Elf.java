package castingTask2;

//각각 가지고 있는 아이템을 드랍
//요정 클래스
//드랍 - 팬던트
//메서드 -> 눈물을 흘린다 출력

public class Elf extends Enemy {
	void shedTears() {
		System.err.println("눈물을 흘린다");
	}

	{
		this.item = "팬던트";
	}
	
	public Elf() {;}
}
