package day03operators;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		String adSoyad = scan.nextLine();
	
		System.out.println("Lutfen adresinizi giriniz.");
		String adres = scan.nextLine();
		
		
		System.out.println("Baba adinizi giriniz");
		String babaAdi = scan.nextLine();
		
		
		System.out.println("lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		
		System.out.println("Istanbul`da mi yasiyorsunuz? True/False");
		boolean yasam = scan.nextBoolean();
		
		
		System.out.println(adSoyad);
		System.out.println(adres);
		System.out.println(babaAdi);
		System.out.println(yas);
		System.out.println(yasam);
scan.close();
	}

}
