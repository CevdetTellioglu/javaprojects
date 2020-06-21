package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		/*
		 * Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan bir program yazınız. (float kullanınız)
			Not 1: pi sayısı: 3.14159
			Not 2: Alan: 3.14159 x radius x radius
			Not 3: Cevre: 2 x 3.14159 x radius
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dairenin yari capini giriniz");
		
		double pi = 3.14159;
		
		float radius = scan.nextFloat();
		
		System.out.println("Daire'nin alani = "+ pi * radius * radius);
		System.out.println("Daire'nin cevresi = "+ 2 * pi * radius );
		scan.close();
	}

}
