package anonymousTest;

public class AnonymousTest {
	public static void main(String[] args) {
		Study study = new Study() {
			@Override
			public void setTopic(String topic) {
				System.out.println(topic);
			}
		};
		study.setTopic("asdf");
	}
}
