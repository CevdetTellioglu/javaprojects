package day02wrapperclasses;

import java.util.Scanner;

public class Scanner09 {

	public static void main(String[] args) {
		// Mil’i kilometreye çeviren bir program yazınız. (double kullanınız) Not 1: km = mile x 1.6
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Km ye cevirmek istediginiz mil uzunlugu:");
		
		int mil = scan.nextInt();
		
		System.out.println((mil*1.6) + " km eder.");
		
		scan.close();
	}

}
