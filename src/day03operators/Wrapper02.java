package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
		// Kullanicidan ilk ismini alin ekrana yazdirin 
		// Kullanicidan soy ismini alin ekrana ilk isminin altina yazdirin
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi giriniz");
		
		String isim = scan.nextLine();
		
		System.out.println("Lutfen soyadinizi giriniz");
		
		String soyisim = scan.nextLine();
		
		System.out.println(isim);
		System.out.println(soyisim);

		scan.close();
	}

}
