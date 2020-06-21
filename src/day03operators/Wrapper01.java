package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		// Kullanicidan ad ve soyadini alip ekrana yazdiran bir program yaziniz/
		//(String kullaniniz)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		
		String isim = scan.nextLine(); // next() veya nextLine kullanirsiniz strinleri almak icin 
										// next() tek kelimelik Stringler icin kullanilir 
										// nextLine() girilen tum String i almak icin kullanilir
		System.out.println(isim);
		
		scan.close();
		
	}

}
