package castingTask2;

//캐릭터 클래스
// 사냥메서드


// 각각 가지고 있는 아이템을 드랍

//오크 클래스
// 드랍 - 도끼
// 메서드 -> 콜록 출력

//요정 클래스
// 드랍 - 팬던트
// 메서드 -> 눈물을 흘린다 출력

//휴먼 클래스
// 드랍 - 골드
// 메서드 -> 해치웠나 출력

public class CastingTask2 {
	public static void main(String[] args) {
		Character ch = new Character("chName");
		Enemy[] monsters = {new Ork(), new Elf(), new Human()};
		for(int i = 0; i < monsters.length; i++) {
			ch.hunt(monsters[i]);
			System.out.println();
		}

		System.out.println("빠른 for문");
	//		빠른 for문
		for(Enemy enemy : monsters) {
			ch.hunt(enemy);
			System.out.println();
		}
	}
}
