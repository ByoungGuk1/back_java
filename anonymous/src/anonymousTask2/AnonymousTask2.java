package anonymousTask2;

public class AnonymousTask2 {
	public static void main(String[] args) {
		MyIner myInter = new MyIner() {
			
			@Override
			public void getString(String content) {
				String result = "";
//				char[] chars = content.toCharArray(); 문자열을 문자배열로 바꿔줌
				for(int i = 0; i < content.length(); i++) {
					result = i > 1 ? result + (char)(content.charAt(i) + 1) : result + content.charAt(i);
				}
				System.out.println(result);
			}
			
			@Override
			public String changeUpperOrLower(String content) {
				String result = "";
				char getChar = ' ';
				for(int i = 0; i < content.length(); i++) {
					getChar = content.charAt(i);
					if(getChar >= 'a' && getChar <= 'z') {
						result += (char)(getChar - ('a' - 'A'));
					} else if(getChar >= 'A' && getChar <= 'Z') {
						result += (char)(getChar + ('a' - 'A'));
					} else {
						result += getChar;
					}
				}
				return result;
			}
		};
		
		myInter.getString("ABCD");
		System.out.println(myInter.changeUpperOrLower("aBCdE"));
	}
}
