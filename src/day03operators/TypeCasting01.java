package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		// 
		
		byte by = 101;
		int sayi = by; // kucuk data tipini buyuk data tipine cevirmek icin
						// ekstra bir kod yazmaya gerek yok java bunu otomatik olarak yapar
						//Auto Widening
		System.out.println(sayi);
		
		int sayi2 = 53;
		byte by2 = (byte) sayi2; // buyuk data tipini kucuk data tipine ceirmek 
								// java tarafindan yapilmaz .
								/*
								 * ORNEKteki gibi sag tarafa donusturmek istedigimiz data tipini
								 * parantez icinde yazmaliyiz
								 * 
								 */
		System.out.println(by2);
		
		
		double sayi3 = 23.5;
		int by3 = (int) sayi3;
		
		System.out.println(by3);
		
		float sayi4 = -23.9f;
		short by4 = (short)sayi4;
		System.out.println(by4);
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		double sonuc1 = sayi5 / sayi6;
		System.out.println(sonuc1);
		
		int sonuc2 = (int)(sayi5 / sayi6);
		System.out.println(sonuc2);
		
		int sayi7 = 5;
		int sayi8 = 3;
		
		int sonuc3 = sayi7 / sayi8;
		System.out.println(sonuc3);  // Normalde 5/3 = 1.66666 ... ama data type'i int yaparsaniz
									// sadece tam kismi gorursunuz.
		int sayi9 = 255;
		byte by5 = (byte)sayi9;
		
		System.out.println(by5); // Normalde byte'da (-128....-1,0,1.......127) 256 sayi var
								// 255 sayisi 256 dan bir eksik o yuzden ekrana -1 yazilir
		
		
		
		
	}

}
