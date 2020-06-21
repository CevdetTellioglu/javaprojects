package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date formatini degistirme
		
		LocalDate date=LocalDate.now();
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MMM/yyyy");// 20-May-2020
		System.out.println(dtf.format(date));
		
		DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf1.format(date));
		
		DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("dd/M/yyyy");
		System.out.println(dtf2.format(date.plusMonths(7)));
		
		DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("yyyy/M/dd");
		System.out.println(dtf3.format(date.plusMonths(7)));
		
		//Time formatini degistirmek 
		
		LocalTime time = LocalTime.now();
		
		DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("hh:mm"); // HH kullanirsaniz 24 luk dilimi kullanir
		System.out.println(dtf4.format(time.plusHours(3)));
		
		// Baska ulkenin local zamanini almak
		
		System.out.println(LocalTime.now(ZoneId.of("America/Sao_Paulo")));

	}

}
