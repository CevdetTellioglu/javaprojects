package day09switchoperator;

import java.util.Scanner;

public class SwitchStatementHomeWork02 {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın. 
		//“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
		//Bu harflerin dışında bir character için “Geçersiz character” yazdırın.
		Scanner letter = new Scanner(System.in);
		System.out.println("Please enter a letter");
		char c1=letter.next().charAt(0);
		
		switch ( c1 ) {
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println("this letter vowel");
			break;
		case'b':
		case'c':
		case'd':
		case'f':
			System.out.println("this silent letters");
			break;
		default:
			System.out.println("invalid letters");
		}
	letter.close();
	}

}
