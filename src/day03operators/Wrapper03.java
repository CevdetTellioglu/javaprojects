package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		//Kullanicidan ad ve soyadini alalim ekrana yazdiralim
		//Kullanicidan adresini alalim ekrana yazdiralim (2.cadde bakirkoy istanbul Turkiye)
		//Kullanicidan yasini alalim ekrana yazdiralim
		//Kullaniciya "Turkiye'de yasiyorum. Dogru/Yanlis" diye soralim cevabini ekrana yazdiralim.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi  ve soyadinizi giriniz");
		String adSoyad = scan.nextLine();
		
		System.out.println("Lutfen adresinizi giriniz");
		String adres = scan.nextLine();
		
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		System.out.println("Turkiye'de yasiyorum. dogru/yanlis");
		boolean konum = scan.nextBoolean();
		
		System.out.println("Isim soysim = "+ adSoyad);
		System.out.println("Adres ="+ adres);
		System.out.println("yas = "+ yas);
		System.out.println("Turkiye'de mi? = "+konum);
		
		scan.close();
		
	}

}
