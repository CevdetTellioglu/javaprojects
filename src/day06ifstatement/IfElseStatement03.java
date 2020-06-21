package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// Kullanicidan alacagi urun miktarini ve fiyatini alalim
		// Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen satin alacaginiz urun fiyatini giriniz");
		double price=scan.nextDouble();
		System.out.println("Lutfen satin alacaginiz urun adedini giriniz");
		double pcs = scan.nextDouble();
		
		if(pcs>=1000) {
			System.out.println("%20 indirimden sonra toplam odeme tutariniz "+ (pcs *(price*80)/100)+ "Euro");
		}else {
			System.out.println("Odeme tutari :"+ (price*pcs) + "Euro");
		}
		
		scan.close();
		

	}

}
