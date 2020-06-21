package day06review;

import java.util.Scanner;

public class IfElseStatementRv03 {

	public static void main(String[] args) {
		// Kullanicidan alacagi urun miktarini ve fiyatini alalim
		// Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen urun fiyatini giriniz");
		double price=scan.nextDouble();
		System.out.println("Lutfen urun adedini giriniz");
		double pcs=scan.nextDouble();
		
		if(pcs>=1000) {
			System.out.println("Aldigini urun adedi : "+ pcs );
			System.out.println("Aldiginiz toplam urun tutari, indirimle birlikte : "+ ((pcs*price)*80/100));
		}else {
			System.out.println("Aldigini urun adedi : "+ pcs );
			System.out.println("Aldiginiz toplam urun tutari :"+ pcs*price);
		}
		scan.close();
	}

}
