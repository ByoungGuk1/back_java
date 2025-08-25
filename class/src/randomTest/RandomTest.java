package randomTest;

import randomTask.RandomTask;

//import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
//		Random random = new Random();
//		System.out.println(random.nextInt(1, 46));
		int[] arr = new int[6];
		RandomTask rt = new RandomTask();
		rt.randomNumbers(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
