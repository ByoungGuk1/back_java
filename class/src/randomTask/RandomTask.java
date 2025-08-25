package randomTask;

import java.util.Random;

//*로또 번호를 추첨하는 기능
//1. 반복되는 코드를 반복문으로
//2. 메서드로 생성
//3. 6개를 배열로 리턴
//4. 메인 메서드에서 사용 

//중복 값 처리해보기
public class RandomTask {
	public int[] randomNumbers(int[] numbers){		
		Random random = new Random();
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(1,46);
		}
		return numbers;
	}
}
