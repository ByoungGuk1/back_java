package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException, FileNotFoundException {
//		해당 메서드를 핸들러를 통해 IOException, FileNotFoundException 에러를 컴파일러에 날려버리기 

//		파일 쓰기
//		new FileWriter("경로", "이어쓰기 여부");
			BufferedWriter bufferedWriter =  new BufferedWriter(new FileWriter("fileTest.txt", true));
			bufferedWriter.write("파일에 문장 추가\n줄바꿈 한번");
//			bufferedWriter.flush();
			bufferedWriter.close();
//			버퍼를 닫으면서 해당 값을 파일에 보냄 == 닫기 + .flush()

//		파일 읽기
		BufferedReader bufferedReader = new BufferedReader(new FileReader("fileTest.txt"));
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();

	}
}
