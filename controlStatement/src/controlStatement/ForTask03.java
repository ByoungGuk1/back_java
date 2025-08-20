package controlStatement;

public class ForTask03 {
	public static void main(String[] args) {
		final String quest = "Q. %s\n",result = "A. %s\n\n";
		
//		---
		
		System.out.printf(quest,"1~100 7의 합 구하기");
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			if((i + 1) % 7 == 0) sum += i + 1;
		}
		System.out.printf(result,sum);
		
//		---
		
		System.out.printf(quest,"a ~ z까지 반복해서 아래의 결과를 출력한다. result)aBcDeFg ... Z");
		String q2Result = "";
		for(int i = 0; i <= 'z'-'a'; i++) {
			q2Result += (char)((i % 2 == 0 ? 'a' : 'A') + i);
		}
		System.out.printf(result,q2Result);
		
	}
}
