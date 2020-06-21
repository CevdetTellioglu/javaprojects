package day06review;

import java.util.Scanner;

public class IfElseIfStatementRv02 {

	public static void main(String[] args) {
				//Kullanicidan sinav notunu tamsayi olarak girmesini isteyin
				//Negatif girerse ekrana "Yanlis deger girdiniz" yazdirin
				//0 dan buyuk ve esit 50 den kucuk girerse ekrana "kaldiniz" yazdirin
				//50 den buyuk ve esit 80 den kucuk ise ekrana "Gectiniz" yazdirin
				//80 den buyuk ve esit 100 den kucuk ise ekrana "Tebrikler" yazdirin
				Scanner scan = new Scanner(System.in);
				System.out.println("Please enter your notes");
				int note=scan.nextInt();
				if(note<0) {
					System.out.println("Error, Try again");
				}else if(note<50) {
					System.out.println("Not enough");
				}else if(note<80) {
					System.out.println("Good");
				}else if(note<=100){
					System.out.println("Congratulations!");
				}else {
					System.out.println("Error, Try Again");
				}
scan.close();
	}

}
