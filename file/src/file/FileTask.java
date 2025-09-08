package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileTask {
	public static void main(String[] args) throws IOException{
//		음식 4개 작성	-> 파일 이름은 foods.txt
//		음식 1개당 1줄씩 사용
		String[] foods = {"리조또", "봉골레 파스타", "피자", "스테이크"};

		BufferedWriter bw = new BufferedWriter(new FileWriter("foods.txt", true));
		for (String food : foods) {
			bw.write(food + "\n");
//			bw.newLine(); // 비추
		}
		System.out.println("food.txt 파일 추가 완료");
		bw.close();

////		food.txt 파일에 모든 음식을 가져와서 콘솔에 출력하기
//		BufferedReader br = new BufferedReader(new FileReader("foods.txt"));
//		String food = null;
//		ArrayList<String> foodList = new ArrayList<>();
//		
//		while((food = br.readLine()) != null) {
//			foodList.add(food);
//		}
//		
//		foodList.stream().forEach(System.out::println);
//		System.out.println();
//		System.out.println("foodList : " + foodList);
//		System.out.println("foodList.size() : " + foodList.size());
//		
//		br.close();
		
////		값 수정
////		봉골레 파스타 -> 알리오 올리오
//
//		BufferedReader br = new BufferedReader(new FileReader("foods.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("foods.txt", false));
//		String food = null;
//		ArrayList<String> foodList = new ArrayList<>();
//
//		while((food = br.readLine()) != null) {
//			if(food.equals("봉골레 파스타")) {
//				bw.write("알리오 올리오\n");
//			}
//			foodList.add(food);
//		}
//
//		br.close();
//		bw.close();
//
//		foodList.forEach(System.out::println);

//		값 삭제
//		"알리오 올리오" 삭제
		BufferedReader br = new BufferedReader(new FileReader("foods.txt"));
		String food = null;
		ArrayList<String> foodList = new ArrayList<>();

		while((food = br.readLine()) != null) {
			if(food.equals("봉골레 파스타")) {
				continue;
			}
			foodList.add(food);
		}
		br.close();
		
		/*BufferedWriter*/ bw = new BufferedWriter(new FileWriter("foods.txt", false));
		for(String food1 : foodList) {
			bw.write(food1 + "\n");
		}
		bw.close();
		System.out.println("값 삭제 완료");

	}
}

//---

//package fileTest;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Arrays;
//
//public class FileTask {
//   public static void main(String[] args) throws IOException{
////      음식 4개 작성 -> foods.txt
////      음식 1개당 1줄씩 사용
////      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods.txt", true));
////      String[] foods = {"리조또", "봉골레 파스타", "피자", "스테이크"};
////      Arrays.asList(foods).stream().forEach(food -> {
////         try {
////            bufferedWriter.write(food + "\n");
//////            bufferedWriter.newLine(); // 비추 
////         } catch (IOException e) {
////            e.printStackTrace();
////         }
////      });
////      
////      System.out.println("foods.txt 파일을 생성했습니다.");
////      bufferedWriter.close();
//      
////      foods.txt
////      음식을 모두 가져와서 콘솔에 출력
////      BufferedReader bufferedReader = new BufferedReader(new FileReader("foods.txt"));
////      String line = null;
////      while((line = bufferedReader.readLine()) != null) {
////         System.out.println(line);
////      }
////      bufferedReader.close();
//      
////      값 수정
////      "봉골레 파스타" -> "알리오올리오 파스타"로 변경
//      BufferedReader bufferedReader = new BufferedReader(new FileReader("foods.txt"));
//      String line = null, temp = "";
//   
//      while((line = bufferedReader.readLine()) != null) {
//         if(line.equals("봉골레 파스타")) {
//            temp += "알리오올리오 파스타\n";
//            continue;
//         }
//         temp += line + "\n";
//      }
//      bufferedReader.close();
//      
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods_v2.txt", true));
//      bufferedWriter.write(temp);
//      
//      System.out.println("foods.txt 수정 했습니다.");
//      bufferedWriter.close();
//
//   }
//}

