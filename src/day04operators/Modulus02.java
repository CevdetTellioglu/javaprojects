package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		////kullainicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yazniniz.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		
		int sayi1 = scan.nextInt();
		int onlar = sayi1%10;
		int binler = sayi1/1000;
		
		System.out.println(onlar+binler);
	scan.close();
	}

}
