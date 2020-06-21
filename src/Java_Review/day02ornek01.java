package Java_Review;

import java.util.Scanner;

public class day02ornek01 {

	public static void main(String[] args) {
		// Scanner kullanarak kullanıcıdan saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
		Scanner scan=new Scanner(System.in);
		int saat,dakika,saniye;
		String pmOrAm1=" ";
		
		
		System.out.println("Saati giriniz: ");
		saat=scan.nextInt();
		System.out.println("dakikayi giriniz: ");
		dakika=scan.nextInt();
		System.out.println("Saniyeyi giriniz: ");
		saniye=scan.nextInt();
		System.out.println("Am or Pm");
		pmOrAm1=scan.next();
		
		System.out.println(saat+":"+dakika+":"+saniye+" "+pmOrAm1);
		scan.close();
	}

}
