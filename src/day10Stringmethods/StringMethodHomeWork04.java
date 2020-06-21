package day10Stringmethods;

import java.util.Scanner;

public class StringMethodHomeWork04 {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		Scanner scan= new Scanner(System.in);
		System.out.print("Ülkenizin adini yaziniz: ");
		String country = scan.next();
		country= country.toLowerCase();
	
		
		switch (country) {
		
		case "amerika":
			System.out.println("USA");
			break;
			
		case "ingiltere":
			System.out.println("UK");
			break;
			
		case "fransa":
			System.out.println("FR");
			break;
			
		default :
			System.out.println("NA");
		
		
		}
		
	scan.close();	
		


	}

}
