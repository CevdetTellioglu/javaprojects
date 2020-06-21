package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		//Kullanicidan sinav notunu tamsayi olarak girmesini isteyin
		//Negatif girerse ekrana "Yanlis deger girdiniz" yazdirin
		//0 dan buyuk ve esit 50 den kucuk girerse ekrana "kaldiniz" yazdirin
		//50 den buyuk ve esit 80 den kucuk ise ekrana "Gectiniz" yazdirin
		//80 den buyuk ve esit 100 den kucuk ise ekrana "Tebrikler" yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen sinav notunu giriniz : ");
		
		int note = scan.nextInt();
		
		if(note<0) {
			System.out.println("Yanlis deger girdiniz");
		}else if(note>+0 && note<50) {
			System.out.println("Kaldiniz");
		}else if(note>=50 && note<80) {
			System.out.println("Gectiniz");
		}else if(note>=80 && note<=100) {
			System.out.println("Tebrikler");
		}else {
			System.out.println("Yanlis deger girdiniz");
		}
		scan.close();
	}

}
