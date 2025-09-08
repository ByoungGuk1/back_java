package synchronizedTest;

public class KBBank {
	public static void main(String[] args) {
		ATM atm = new ATM();

		Thread parent = new Thread(atm, "엄마");
		Thread chiled = new Thread(atm, "자식");

		parent.start();
		chiled.start();

	}
}
