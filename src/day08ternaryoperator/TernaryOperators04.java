package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperators04 {

	public static void main(String[] args) {
		// Ternary Operator (if Else if)
		
		//Kullanicidan bir sayi aliniz.
		// Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
		//10 dan kucuk ise ekrana "Rakam" yazdiriniz. degilse "Pozitif veya 0" yazdiriniz.
		// Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
		

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter first integer number");
		int num=scan.nextInt();
		
		String result = num>=0 ? (num<10 ? "Rakam" : "Pozitive") : "Negative";
		
		System.out.println(result);
		
		scan.close();

	}

}
