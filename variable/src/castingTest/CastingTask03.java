package castingTest;

public class CastingTask03 {
	public static void main(String[] args) {
		char a = 'a', j = 'j', k = 'k';
		char largeA = ' ', largeJ = ' ', largeK = ' ';
		int asciiGap = 'a' - 'A';
		
		largeA = (char)(a - asciiGap);
		largeJ = (char)(j - asciiGap);
		largeK = (char)(k - asciiGap);
		
		System.out.printf("a : %c => a - asciiGap(%d) => result : %c\n", a, asciiGap, largeA);
		System.out.printf("j : %c => j - asciiGap(%d) => result : %c\n", j, asciiGap, largeJ);
		System.out.printf("k : %c => k - asciiGap(%d) => result : %c", k, asciiGap, largeK);
	}
}
