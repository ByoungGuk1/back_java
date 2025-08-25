package inheritanceTask;

//StudentTask
//인스타아이디
//각 메서드 출력
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다

public class StudentTask extends PersonTask{
	String instagramId;
	
	@Override
	void work() {
		System.out.println("아르바이트를 한다.");
	}
	@Override
	void sleep() {
		System.out.println("수업시간에 잠을 잔다.");
	}
	@Override
	void eat() {
		System.out.println("아침을 거른다.");
	}
	
	public StudentTask() {;}
	public StudentTask(String name, int age, String address, String phone, String instagramId) {
		super(name, age, address, phone);
		this.instagramId = instagramId;
	}
}
