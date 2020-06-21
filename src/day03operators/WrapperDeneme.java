package day03operators;

import java.util.Scanner;

public class WrapperDeneme {

	public static void main(String[] args) {
		
		
		
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Lutfen alt tabani giriniz");
			
			short altTaban= scan.nextShort();
			
			System.out.println("Lutfen ust tabani giriniz");
			
			short ustTaban = scan.nextShort();
			
			System.out.println("Lutfen yukseklik giriniz");
			
			short yukseklik = scan.nextShort();
			
			System.out.println(((altTaban+ustTaban)*yukseklik)/2);
			
		scan.close();	
	}
}
