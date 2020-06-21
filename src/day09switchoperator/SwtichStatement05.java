package day09switchoperator;

import java.util.Scanner;

public class SwtichStatement05 {

	public static void main(String[] args) {
		// Kullanıcıdan A, B, C, D harflerinden birini alın 
		//eğer harf C ise ekrana “Doğru cevap” yazdırın.
		//A, B, D den biri ise ekrana “Yanlış cevap” yazdırın.
		//Bu harflerin dışındaki harfler için “Geçersiz cevap şıkkı” yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter one character");
		String letter=scan.next();
		letter = letter.toLowerCase();
		switch(letter) {
		case"c":
			System.out.println("Answer Correct");
			break;
		case"a":
		case"b":
		case"d":
			System.out.println("Answer incorrect");
			break;
			default:
				System.out.println("Try again");
			
		}
		scan.close();
	}

}
