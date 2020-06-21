package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve 
     cevresini hesaplayıp ekrana yazdıran bir program yazınız. 
     Not: Alan: Boy x En
     Not: Çevre: 2x (Boy + En)

		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Uzun ve Kisa kenari giriniz");
		
		
		int uzunKenar = scan.nextInt();
		int kisaKenar = scan.nextInt();
		
		System.out.println("Dikdortgen alan.." + uzunKenar * kisaKenar);
		System.out.println("Dikdorgen cevre.. "+ 2 *(uzunKenar + kisaKenar));
				
		scan.close();
			
	}

}
