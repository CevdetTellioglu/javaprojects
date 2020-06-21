package day03operators;

import java.util.Scanner;

public class Wrapper04 {

	public static void main(String[] args) {
		//Kullanıcıdan ad ve soyadını alıp ekrana yazdıran bir program yazınız. (String kullanınız)

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen adinizi soyadinizi giriniz");
		
		String adSoyad = scan.nextLine();
		
		System.out.println("Isim soyisim:" + adSoyad);
		scan.close();
	}

}
