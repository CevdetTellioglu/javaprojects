package day06review;

import java.util.Scanner;

public class IfElseStatementRv01 {

	public static void main(String[] args) {
			//Kullanicidan password girmesini isteyin
				//password dogru ise ekrana “Password dogru” yazdirin
				//password yanlis ise ekrana “Password yanlis tekrar deneyin” yazdirin
				//Dogru password = Java2020
		Scanner scan = new Scanner(System.in);
		System.out.println("Password Please");
		String pass=scan.next();
		
				// Stringlerin esitligini kontrol ederken
				// asla "==" kullanmayin
				//Onun yerine 
				//"equals()" kullanin
				
				//"==" String'in degerini ve adresini kontrol eder
				// "equals()" method ise sadece degerleri kontrol eder.
		
		if(pass.equals("Cevdet")) {
			System.out.println("congratulations.");
		}else {
			System.out.println("Please try again");
		}
			scan.close();	
	}

}
