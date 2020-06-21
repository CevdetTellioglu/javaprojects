package day10Stringmethods;

import java.util.Scanner;

public class StringMethodHomeWork03 {

	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Adinizi ve Soyadinizi giriniz: ");
		String adSoyad = scanner.nextLine();
		
		int boslukIndex = adSoyad.indexOf(' ');
		String ad = adSoyad.substring(0,boslukIndex); // ad
		
		String ikinciAd = adSoyad.substring(boslukIndex, adSoyad.length());
			
		System.out.println("Ad Soyad: "+ad.substring(0,1).toUpperCase()+ad.substring(1)+
				ikinciAd.substring(0,2).toUpperCase()+ikinciAd.substring(2));
		
		
		
		
		scanner.close();

	}

}
