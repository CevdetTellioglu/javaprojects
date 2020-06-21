package day09switchoperator;

import java.util.Scanner;

public class SwitchRV01 {

	public static void main(String[] args) {
		
	        // A harfini bulunca "Ilk harf", B harfini bulunca "Ikinci harf"
	        // C harfini bulunca "Ucuncu harf", D harfini bulunca "Dorduncu harf"
	        // yazdiran programi if else if() ve switch() kullanarak yaziniz.
	        // digerleri icin "Bilmiyorum"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a char character");
		
		char ch=scan.next().charAt(0);
		
		
		switch (ch){
			case'A':
				System.out.println("First Character");
				break;
			case'B':
				System.out.println("Second Character");
				break;
			case 'C':
				System.out.println("thirth Character");
				break;
			case 'D':
				System.out.println("Fourth Character");
			default:
				System.out.println("I don't know");
					
					
		scan.close();
	        
		}
	}

}
