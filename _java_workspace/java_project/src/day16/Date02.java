package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		String t = today.toString(); //toString() 스트링으로 객체를 변환
		System.out.println(t);
		//날짜 2024-01-26 / 시간 17:03:50
		System.out.println(t.substring(0,t.indexOf("T")));
		System.out.println(t.substring(t.indexOf("T")+1,t.indexOf(".")));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(1999, 11, 18, 11, 11);
		System.out.println(sDate.format(dtf));

	}

}
