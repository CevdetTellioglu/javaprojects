package day02wrapperclasses;

import java.util.Scanner;

public class Scanner10 {

	public static void main(String[] args) {
		
		//Saati saniyeye çeviren bir program yazınız. (long kullanınız) Not 1: Saniye = Saat x 60 x 60
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Saniyesini bulmak istediginiz saat'i giriniz : ");
		
		long saat = scan.nextLong();
		
		System.out.println((saat * 60 * 60)+" kadar saniye eder.");
		
		scan.close();
	}

}
