package synchronizedTest;

public class ATM implements Runnable {
	int money = 10000;
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			withdraw(1000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("멈추고 탈출");;
				}
			Thread.interrupted();
//			탈출 후 정상 종료
		}
	}
	
	public void withdraw(int money) {
		synchronized (this /* == ATM <- ATM 클래스를 의미*/) {
			this.money -= money;
		}
		System.out.println(Thread.currentThread().getName() + "이(가) " + money + "원 출금");
		System.out.println("현재 잔액 : " + this.money + "원");
	}
}
