package day06ifstatement;

import java.util.Scanner;

public class Ifstatement01 {

	public static void main(String[] args) {
		
		if (3>2) {
			
			System.out.println("if body calisti");
		
			
		}
	
		
		System.out.println("if body disi calismadi");
		
		//bir int variable olusturun ve ona bir deger atayin 
		// eger atadiginiz deger pozitif ise ekrana pozitif yazdirin
		//eger atadiginz deger negatif ise ekrana negatif yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
	
		int num1 = scan.nextInt();
		if (num1>0) {
			System.out.println("Pozitif bir sayi girildi = "+ num1);
		if (num1<0) 
			System.out.println("Negatif bir sayi girildi = "+ num1);
		if (num1==0)
			System.out.println("Notr bir sayi girildi = " + num1);
		
		}
	scan.close();
	}

}
