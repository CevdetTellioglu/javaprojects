package day06ifstatement;

import java.util.Scanner;

public class IfStatementHomework02 {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
		//“b, c, d, e” den biri ise ekrana “Sessiz harf” yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz.");
		String letter = scan.next();
		
		if ( letter.equals("a") ||letter.equals("e") ||letter.equals("i") ||letter.equals("o")|| letter.equals("u")) {
			System.out.println("sesli harf");
			}else if( letter.equals("b") ||letter.equals("c") ||letter.equals("d")) {
				System.out.println("Sessiz harf");
			}
		
		scan.close();
		
	}

}
