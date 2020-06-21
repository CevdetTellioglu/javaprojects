package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi aliniz 
		//Sayi pozitif veya 0 ise ekrana "Pozitif" yazdiriniz.
		//Sayi negatif ise ekrana "Negatif" yazdiriniz.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter one number :");
		double num=scan.nextDouble();
		
//		if(num>=0) {
//			System.out.println("Pozitive or Notr");
//		}else {
//			System.out.println("Negative");
//		}
//		
		
													//Ternary Operator
		// 				Condition   soru isareti  Condition dogru ise			iki nokta ustuse	condition yanlis ise 
		
		String sonuc =   (num>=0)          ?        "Pozitive or Notr"		:					"Negative";
		System.out.println(sonuc);
		
		
		
		
		
		
		
		
	scan.close();	
	}

}
