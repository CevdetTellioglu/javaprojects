package day04operators;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		 
		// Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini bulunuz
		// Kullanicinin girdigi 4 basamakli sayinin tum rakamlari toplamini bulunuz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int birlerBas = sayi%10;
		int onlarBas  =(sayi/10)%10;
		int yuzlerBas =(sayi/100)%10;
		int binlerBas =sayi / 1000;
		
		System.out.println("Ilk ve son rakamlari toplami = "+ (birlerBas +binlerBas));
		System.out.println("Tum rakamlari toplami = "+ (birlerBas+onlarBas+yuzlerBas+binlerBas));
		
		System.out.println(8.0 / 2);
		System.out.println(8 / 2.0);
		System.out.println(8.0 / 2.0);
		scan.close();
		
	}
}
