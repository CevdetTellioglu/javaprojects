package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		// kullanicidan bir dikdortgenin en ve boyunu alin 
		// en ve boy esit ise bu bir karedir yazdir
		// en ve boy farkli ise bu bir dikdortgendri yazdir
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi giriniz");
		double en = scan.nextDouble();
		double boy = scan.nextDouble();
		
		if(en==boy) {
			System.out.println("bu bir karedir");
			
		}
		if (en != boy) {
			System.out.println("Bu bir dikdortgendir");
		}
		
		// else ==> diger ihtimallerin tamami demek 
		// en ile boy ya esittir ya degildir..
		
		if(en==boy) {
			System.out.println("Bu bir karedir");
		}else {
			System.out.println("Bu bir dikdortgendir");
			
		}
		scan.close();
		
		
	}

}
