package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		// Kullanicidan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir.
		//Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50  bir
		// jackpot oyunu icin program yaziniz
		// 000000 - 000001 -000002 - ..... - 999998-999999-100000
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("6 Basamakli bir sayi giriniz 0 basta olabilir");
		 int num= scan.nextInt();
		 
		 if(num<200000) {
			 System.out.println("KAZANDINIZ");
		 }else if(num<500000) {
			 System.out.println("AMORTI- TEKRAR DENEYINIZ");
		 }else {
			 System.out.println("KAYBETTINIZ");
		 }
		
		scan.close();

	}

}
