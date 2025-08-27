package anonymousTask2;

public interface MyIner {
	//	입력 : ABCD -> 출력 : ABDE
	public void getString(String content);
	
	//	문자열을 입력받고 소문자는 대문자로,
	//	대문자는 소문자로 바꿔주는 메서드
	public String changeUpperOrLower(String content);
}
