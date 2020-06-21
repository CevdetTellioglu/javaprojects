package day09switchoperator;

import java.util.Scanner;

public class SwitchStatementHomeWork01 {

	public static void main(String[] args) {
		//Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdırın.
		//“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdırın. 
		//“Pazar” ise ekrana
		//“Hıristiyanlar için kutsal gün” yazdırın.
		//Diger günler icin “Kutsal gün değil” yazdırın.
		Scanner days = new Scanner(System.in);
		System.out.println("Please enter the day");
		String day=days.next();
		day = day.toLowerCase();
		switch(day) {
		case"friday":
			System.out.println("Holy day for the Muslim");
			break;
		case"saturday":
			System.out.println("Holy day for the Jews");
			break;
		case"sunday":
			System.out.println("Holy day for the Christians");
			break;
		default:
			System.out.println("Not holy day");	
		}	
	days.close();	
	}
}
