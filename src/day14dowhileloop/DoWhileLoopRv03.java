package day14dowhileloop;

import java.util.Scanner;

public class DoWhileLoopRv03 {

	public static void main(String[] args) {
		// Kullanicidan sayi alin
		// Sayi 10 dan kucuk ise ekrana "Kazandiniz" yazdirin.
		// Sayi 10 veya 10 dan buyuk ise ekrana 
		//"Tekrar deneyiniz" yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		int num=0;
		do {
			System.out.print("Bir sayi giriniz : ");
			num=scan.nextInt();	
		}while(num>=10);
		System.out.println("Win");
		scan.close();
	}

}
