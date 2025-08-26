package castingTask2;

//각각 가지고 있는 아이템을 드랍
//휴먼 클래스
//드랍 - 골드
//메서드 -> 해치웠나 출력

public class Human extends Enemy{
	void end() {
		System.err.println("해치웠나");
	}

	{
		this.item = "골드";
	}
	
	public Human() {;}
}
