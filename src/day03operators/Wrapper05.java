package day03operators;

import java.util.Scanner;

public class Wrapper05 {

	public static void main(String[] args) {
		// Kullanıcıdan ad, soyad ve adresini alıp ekrana yazdıran bir program yazınız. Ad ve soyad ilk satırda, adres ikinci satırda olsun.
		//(String kullanınız)
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ad ve soyadinizi giriniz.");
		String adSoyad = scan.nextLine();
		
		System.out.println("Lutfen adresinizi giriniz.");
		String adress = scan.nextLine();
		
		System.out.println(adSoyad);
		System.out.println(adress);
		scan.close();
	}

}
