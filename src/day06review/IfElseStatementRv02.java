package day06review;

import java.util.Scanner;

public class IfElseStatementRv02 {

	public static void main(String[] args) {
		// 
				// Kullanicidan bir tamsayi isteyin ve o tamsayinin
				// mutlak degerini ekrana yazdirin
				// mutlak deger bir sayinin kendi isareti ile carpilmasi demektir
				// Ornek: -3 un mutlak degeri: -1.-3 = 3
				// Ornek: +5 in mutlak degeri: +1.+5 = 5
				// 0 in mutlak degeri sifirdir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num1 = scan.nextInt();
		if(num1<0) {
			System.out.println(num1+" sayisinin mutlak degeri "+ num1*-1 + "'dir.");
			}else {
				System.out.println(num1+" sayisinin mutlak degeri "+ num1 +"'dir.");
			}
		scan.close();
		
	}
	

}
