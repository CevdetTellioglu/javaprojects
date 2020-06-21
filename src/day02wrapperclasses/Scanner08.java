package day02wrapperclasses;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		
		/*
		 * Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini hesaplayan bir Program yazınız. (byte kullanınız)
			Not 1: Üçgenin Cevresi: a + b + c
		 */
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Ucgenin a kenar uzunlugunu giriniz.");
			byte kenar1=scan.nextByte();
			
			System.out.println("Ucgenin b kenar uzunlugunu giriniz.");
			byte kenar2=scan.nextByte();
			
			System.out.println("Ucgenin c kenar uzunlugunu giriniz.");
			byte kenar3=scan.nextByte();
			 
			System.out.println("Ucgenin cevresi = " + ( kenar1 + kenar2 + kenar3 ));		
	scan.close();
	}

}
