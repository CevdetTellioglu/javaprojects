package day10Stringmethods;

import java.util.Scanner;

public class StringMethodHomeWork05 {

	public static void main(String[] args) {
		//Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harﬁni büyük harf olarak ekrana yazdırın.
		
		
				Scanner scan= new Scanner(System.in);
				System.out.print("Ülkenizin adini giriniz: ");
				String country = scan.next();
				
				String neu = country.substring(0,2).toUpperCase()+country.substring(2);
				
				System.out.println(neu);
				
				scan.close();
	}

}
