package day06review;

import java.util.Scanner;

public class IfElseIfStatementRv01 {

	public static void main(String[] args) {
				//Kullanicidan yasini alin
				// yas 13 den az ise ekrana "Calisamaz" yazdirin
				// yas 13 den 65 e kadar ise ekrana "Calisabilir" yazdirin
				// yas 65 den buyuk ise ekrana "Emekli" yazdirin
				//Negatif sayi girerse "yas negatif olamaz" desin.
				    
		//BOUNDRY ANALYSE \\
		Scanner scan = new Scanner(System.in);
		System.out.println("Please confirm your age:");
		int age= scan.nextInt();
		if(age<0) {
			System.out.println("Error, Try again");
		}else if(age<13) {
			System.out.println("you can't working");
		}else if(age<65) {
			System.out.println("You can work");
		}else {
			System.out.println("You will die");
		}
	scan.close();	
	}

}
