package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
	
		/*
		 * kullanicidam alinan bir sayinin kupunu hesaplayan bir program
		 * yaziniz
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int aKup = scan.nextInt();
		
		System.out.println(aKup*aKup*aKup);
		scan.close();
		
	}

}
