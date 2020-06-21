package day06ifstatement;

import java.util.Scanner;

public class IfElseStatementHomeWork04 {

	public static void main(String[] args) {
		// Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın. 
		//Diğer durumlarda ekrana “Harf değil” yazdırın.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character");
		char ch=scan.next().charAt(0);
		boolean control=Character.isAlphabetic(ch);
		
		if (control==true) {
			System.out.println("Lettre");
		}else {
			System.out.println("Not Lettre");
		}
		scan.close();	
		
	}

}
