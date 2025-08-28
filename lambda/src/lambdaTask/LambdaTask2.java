package lambdaTask;

//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
//5) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"

public class LambdaTask2 {
	public static void main(String[] args) {
		PrintNum printNum = () -> {
//		public void printUpTo10();
			for(int i = 0; i < 10; i++) {
				System.out.printf("%d ", i + 1);
			}
			System.out.println();
		};
//		객체화
		
		PringString printString = (str, ch) -> {
//		public int strCount(String str, char ch);
			int result = 0;
			char[] chArrFromStr = str.toCharArray();
			for(char strChar : chArrFromStr) {
				if(strChar == ch)	result++;
			}
			return result;
		};
		
		Reverse reverse = str -> {
//		public String reverseString(String str);
			String result = "";
			for(int i = 0; i < str.length(); i++) {
				result += str.charAt(str.length() - i - 1);
			}
			return result;
		};
		
		Remove remove = (str, ch) -> {
//		public String removeStr(String str, char ch);
			String result = "";
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ch) continue;
				else	result += str.charAt(i);
			}
			return result;
		};
		
		Dedupe dedupe = str -> {
//		public String getDedupe(String str);
			String result = "";
			boolean flag = false;
			result += str.charAt(0);
			
			for(int i = 0; i < str.length(); i++) {
				for(int j = 0; j < result.length(); j++) {
					if(result.charAt(j) == str.charAt(i)) {
						flag = false;
						break;
					}else {
						flag = true;
					}
				}
				if(flag)	result += str.charAt(i);					
			}

			return result;
		};
		
		printNum.printUpTo10();
		System.out.println();
		
		System.out.println(printString.strCount("abcdecabddecas", 'c'));
		System.out.println();
		
		
		System.out.println(reverse.reverseString("abcdefg"));
		System.out.println();
		
		
		System.out.println(remove.removeStr("aabbcceedd", 'c'));
		System.out.println();
		
		
		System.out.println(dedupe.getDedupe("가나다가나다라가나다라마바사"));
		System.out.println();
		
	}
}

//---

//package lambdaTask;
//
////ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
//public class LambdaTask2 {
// public static void main(String[] args) {
////    객체화
//    PrintNum printNum = () -> {
//       for(int i = 0; i < 10; i++) {
//          System.out.println(i + 1);
//       }
//    };
//    
////    printNum.printUpTo10();
//    
//    PrintString printString = (content, findC) -> {
//       int count = 0;
//       for(char c: content.toCharArray()) {
//          if(c == findC) {
//             count++;
//          }
//       }
//       return count;
//    };
//    
////    System.out.println(printString.strCount("aaabcd", 'a'));
//    
//    Reverse reverse = (content) -> {
//       String result = "";
//       for(int i = 0; i < content.length(); i++) {
//          result += content.charAt(content.length() - 1 - i);
//       }
//       return result;
//    };
//    
////    System.out.println(reverse.reverseString("abcde"));
//    
//    Remove remove = (content, c) -> {
////       return content.replaceAll(String.valueOf(c), "");
//       String result = "";
//       for(char charactor : content.toCharArray()) {
//          if(charactor == c) {
//             continue;
//          }
//          result += charactor;
//       }
//       return result;
//    };
//    
////    System.out.println(remove.removeStr("abcdabcd", 'a'));
//    Dedupe dedupe = (content) -> {
//       String result = "";
//       for(int i = 0; i < content.length(); i++) {
//          if(!result.contains(String.valueOf(content.charAt(i)))) {
//             result += content.charAt(i);
//          }
//       }
//       return result;
//    };
//    
//    System.out.println(dedupe.getDedupe("abcdabcd"));
//    
// }
//}
