package castingTask2;

//각각 가지고 있는 아이템을 드랍
//오크 클래스
//드랍 - 도끼
//메서드 -> 콜록 출력

public class Ork extends Enemy {
	void cough() {
		System.err.println("콜록");
	}
	
	{
		this.item = "도끼";
	}
	
	public Ork() {;}
}
