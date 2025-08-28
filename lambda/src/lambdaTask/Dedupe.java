package lambdaTask;

//5) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"

@FunctionalInterface
public interface Dedupe {
	public String getDedupe(String str);
}
