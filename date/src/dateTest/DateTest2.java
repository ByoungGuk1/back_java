package dateTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTest2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
//		Calendar는 추상화 객체로 재정의 할 것이 너무 많아 .getInstance()를 사용하여 사용

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss");

//		싱글턴 패턴 -> 전역에서 같은 변수를 사용하고 싶을 때 사용
//		즉 Calendar는 싱글턴 패턴은 아님.

		System.out.println(calendar.getTime());
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
//		달력 사용 흐름 : date -> calendar -> LocalDate {날짜만 필요하다면}, LocalDateTime {시간 분 초까지 필요하면}
//		추후 필요시 하단의 클래스 사용
		LocalDate now = LocalDate.now();
		System.out.println(now);

		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);

		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));

		System.out.println(LocalDate.parse("1999년 03월 23일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));

	}
}
