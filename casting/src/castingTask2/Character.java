package castingTask2;

//캐릭터 클래스
//사냥메서드

public class Character {
	String name;
	double exp;
	int level;
	
	void addExp(double exp) {
		System.out.println("경험치 "+ exp +" 획득");
		this.exp += exp;
		if(this.exp >= 100) {
			this.exp -= 100;
			level++;
			System.out.println("---\n레벨업!\nLv : " + this.level +"\n---");
			System.out.println("경험치 " + this.exp + " / 100");
		}
	}
	
	void hunt(Enemy enemy) {
		if(enemy instanceof Ork) {
			Ork ork = (Ork)enemy;
			System.out.println(this.name+"이(가) 오크를 처치");
			System.out.print("오크 : ");
			ork.cough();
			addExp(33.4);
			System.out.println(ork.item + " 획득");
		}else if(enemy instanceof Elf) {
			Elf elf = (Elf)enemy;
			System.out.println(this.name+"이(가) 엘프를 처치");
			System.out.print("엘프 : ");
			elf.shedTears();
			addExp(33.4);
			System.out.println(elf.item + " 획득");
		}else if(enemy instanceof Human) {
			Human human = (Human)enemy;
			System.out.println(this.name+"이(가) 사람를 처치");
			System.out.print("사람 : ");
			human.end();
			addExp(33.4);
			System.out.println(human.item + " 획득");
		}else {
			System.err.println("class type error");
			return;
		}
	}
	
	{
		level = 1;
		exp = 0.0;
	}
	
	public Character() {;}
	public Character(String name) {
		this.name = name;
	}

}
