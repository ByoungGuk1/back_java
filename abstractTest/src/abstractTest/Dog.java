package abstractTest;

public class Dog implements Pet, Animal{
	@Override
	public void poop() {
		System.out.println("패드 위에");
	}
	@Override
	public void sitDown() {
		System.out.println("앉기");
	}
	@Override
	public void waitNow() {
		System.err.println("기다려");		
	}
}
