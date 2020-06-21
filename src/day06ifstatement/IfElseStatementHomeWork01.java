package day06ifstatement;

import java.util.Scanner;

public class IfElseStatementHomeWork01 {

	public static void main(String[] args) {
		// Kullanıcıdan bir tamsayı alın eğer tamsayı 10 dan kucuk ve 0’dan büyük eşit ise ekrana
		//“Rakam” yazdırın. Diğer durumlarda ekrana “Sayı” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter integer number");
		int num = scan.nextInt();
		
		if(num<10 && num>=0) {
			System.out.println("Rakam");
		}else {
			System.out.println("Sayi");
		}
		scan.close();
	}

}
