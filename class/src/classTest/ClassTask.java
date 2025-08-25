package classTest;

// 동물이라는 추상적인 클래스 만들기 (클래스 명은 ClassTask)
// 추상화 된 변수들? : 이름(name), 나이(age), 먹이(feed)
// 생성자 만들기 (기본 생성자, 초기화 생성자)
// 토끼, 강아지, 고양이 라는 객체 생성하기

public class ClassTask {
//	모든 클래스에서 공통적으로 필요하다고 생각하면 클래스에서 선언하고, 아니라 단편적으로 사용하고자 한다면 메인 메서드에서 선언 후 사용

//	필드 -> 추상화 된 상태이기때문에(x) (new 연산자가 초기화 하기 때문에) 초기화는 하지 않음. 필요시 초기화 블록을 사용하여 초기화
	String name;
//			ㄴ>필드변수
	int age;
	String feed;
//	필드

//	생성자 -> 단축키 ALT + SHIFT + S -> _O_
//			생성자의 오버로딩 -> 동일한 이름을 이용하여 생성되는 메서드 ---> 오버로딩
//		기본 생성자
	public ClassTask() {;}
//		초기화 생성자
	public ClassTask(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
//	생성자
	
	public static void main(String[] args) {
		ClassTask rabbit = new ClassTask("토끼", 2, "당근");
		ClassTask dog = new ClassTask("강아지", 3, "강아지 사료");
		ClassTask cat = new ClassTask("고양이", 4, "고양이 사료");

		System.out.println(rabbit.name);
		System.out.println(rabbit.age);
		System.out.println(rabbit.feed);
		System.out.println();

		System.out.println(dog.name);
		System.out.println(dog.age);
		System.out.println(dog.feed);
		System.out.println();
		
		System.out.println(cat.name);
		System.out.println(cat.age);
		System.out.println(cat.feed);
		System.out.println();
	}
	
}
