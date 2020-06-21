package day06ifstatement;

import java.util.Scanner;

public class IfStatementHomeWork04 {

	public static void main(String[] args) {
		//Kullanıcıdan iki sayı alın eğer sayıların işaretleri aynı ise ekrana “Aynı işaretli” yazdırın.
		//Sayıların işaretleri farklı ise ekrana “Farklı işaretli” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int num1=scan.nextInt();
		System.out.println("Please enter second number; ");
		int num2= scan.nextInt();
		
		if(num1>0 && num2>0) {
			System.out.println("Ayni isaretlerdir");
		}else if(num1<0 && num2<0){
			System.out.println("Ayni isaretlerdir");
		}else {
			System.out.println("Farkli isaretlerdir.");
		}
		scan.close();
	}

}
