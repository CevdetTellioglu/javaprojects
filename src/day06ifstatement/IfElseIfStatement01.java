package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {
	
	public static void main(String[] args) {
		//Kullanicidan yasini alin
		// yas 13 den az ise ekrana "Calisamaz" yazdirin
		// yas 13 den 65 e kadar ise ekrana "Calisabilir" yazdirin
		// yas 65 den buyuk ise ekrana "Emekli" yazdirin
		//Negatif sayi girerse "yas negatif olamaz" desin.
		     
		
		
			//BOUNDRY ANALYSE \\
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		
	
		
		int age = scan.nextInt();
		if(age<0) {
			System.out.println("Yas negatif olamaz");
		}else if(age<13) {
			System.out.println("Calisamaz");
		}else if (age<=65 && age>=13 ) {
			System.out.println("Calisabilir");
		}else {
			System.out.println("Emekli");
		}
		
		
		scan.close();
		
		
		
		
	}
	
	
}
