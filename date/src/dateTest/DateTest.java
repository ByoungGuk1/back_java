package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy년 MM월 dd일");
		Date date = new Date();
		System.out.println(date);
		System.out.println(simpleDateFormat.format(date));
		
		try {
			System.out.println(simpleDateFormat.parse("2025년 09월 08일"));
		} catch (ParseException e) {;}
	}
}
