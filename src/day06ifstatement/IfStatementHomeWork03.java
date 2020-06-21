package day06ifstatement;

import java.util.Scanner;

public class IfStatementHomeWork03 {

	public static void main(String[] args) {
		
		//Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
		//“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. 
		//“Pazar” ise ekrana “Hıristiyanlar icin kutsal gün” yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the day");
		String day=scan.next();

		if (day.equalsIgnoreCase("Friday")) {
			System.out.println("Holy day for Muslims");
		}else if(day.equalsIgnoreCase("Saturday")) {
			System.out.println("Holy day for Jews");
		}else if(day.equalsIgnoreCase("Sunday")) {
			System.out.println("Holy day for Christians");
		}else{
			System.out.println("Error!");
		}
		scan.close();
	}

}


