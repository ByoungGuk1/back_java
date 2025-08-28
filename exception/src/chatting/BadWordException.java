package chatting;

//	Exception
//		컴파일러가 검사 후 try ~ catch를 강제한다.
//			ㄴ>	강제 종료시킴.
//	RuntimeException
//		컴파일러가 검사하지 않는다.
//			ㄴ>	강제 종료가 되지 않는다.

public class BadWordException extends RuntimeException{
	public BadWordException() {;}
	public BadWordException(String message) {
		super(message);
	}
}
