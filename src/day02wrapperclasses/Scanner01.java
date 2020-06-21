package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// Kullainici iki tam sayi versin
		// Program bu tamsayilarin toplaminin ve carpimini ekrana yazdirsin.
		
		Scanner scan = new Scanner(System.in); //scanner class'ini import ettik 
		
		System.out.println("Lutfen Iki tam sayi giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 * sayi2);
		scan.close();
		
		

	}

}
