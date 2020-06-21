package day07nestedif;

import java.util.Scanner;

public class NestedIfHomeWork02 {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf girmesini isteyin.
		//Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. 
		//Harf “a” ise ekrana “Ilk küçük harf” yazdırın. “a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
		//Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. 
		//Harf “Z” ise ekrana “Son büyük harf” yazdırın. “Z” değil ise ekrana “Son büyük harf değil” yazdırın.
			Scanner scan = new Scanner(System.in);
			System.out.print("Please enter one character");
			char letter = scan.next().charAt(0);
			
			if(letter<=122 && letter>=97) {
				if(letter==97) {
					System.out.println(letter + " first minuscule letter.");
				}else if(letter!=97) {
					System.out.println(letter +" not first minuscule letter.");
				}
				
			}
			if(letter<=90 && letter>=65) {
				if(letter==90) {
					System.out.println(letter + " last capital letter.");
				}else if(letter!=97) {
					System.out.println(letter +" not last capital letter.");
				}else{
					System.out.println(letter +" not letter.");
				}
			}
			scan.close();
	}

}
