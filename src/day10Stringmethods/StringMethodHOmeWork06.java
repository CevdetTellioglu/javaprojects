package day10Stringmethods;

import java.util.Scanner;

public class StringMethodHOmeWork06 {

	public static void main(String[] args) {
//		Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin bastan ikinci harﬁ ile 
//		sondan ikinci harﬁni  büyük harf olarak ekrana yazdırın.
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ülkenizin adini giriniz: ");
		String country = scanner.next();
		
		String neu = country.substring(0,1).toLowerCase()+country.substring(1,2).toUpperCase()+
				country.substring(2,country.length()-2)+
				country.substring(country.length()-2,country.length()-1).toUpperCase()+
				country.substring(country.length()-1).toLowerCase();
				
				
		
		System.out.println(neu);
		
		scanner.close();

	}

}
