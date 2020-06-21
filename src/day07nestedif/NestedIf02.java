package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		//Kullanicidan password girmesini isteyin
		// Password 4 basamakli bir sayi ise cift olup olmadigini kontrol edin
		// Cift sayi ise ekrana “Password tamam” yazdirin, Tek sayi ise “Tekrar deneyin yazdirin”
		// Password 4 basamakli degil ise “Tekrar deneyin” yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your password");
		
		int pass=scan.nextInt();
		
		if(pass<10000 && pass>999) {
			 
			if(pass%2==0) {
				System.out.println("Ok Password");
					}else if(pass%2==1) {
				System.out.println("Try Again");
				}
			}else{
			System.out.println("Try Again!");
		}
		scan.close();
	}

}
