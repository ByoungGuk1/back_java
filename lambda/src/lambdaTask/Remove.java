package lambdaTask;

//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()

@FunctionalInterface
public interface Remove {
	public String removeStr(String str, char ch);
}
