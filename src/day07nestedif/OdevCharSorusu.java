package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		/*
        * Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
        * Diğer durumlarda ekrana “Harf değil” yazdırın.
        */
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a character");
		char letter = scan.next().charAt(0); // kullanicidan char almak icin kullanilir.
	
	
		if((letter<=122 && letter>=97) ||(letter<=90 && letter>=65)) {
			System.out.println("bu bir harftir");
		}else {
			System.out.println("harf degildir.");
		}
	scan.close();
	
	
	
	}
}
