package day15methodcreation;

import java.util.Scanner;

public class MethodCreationHm04 {

	public static void main(String[] args) {
		//soruları çözerken metodları main methodun
		//dışında oluşturup main methodun icinden çağırınız.
		
		// Kullanıcıya paralelkenar, dikdörtgen veya ucgen kelimelerinden
		// birini ve iki sayı seçmesini söyleyin. Hangi şekli seçerse, 
		// o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen methodunuzu paralelkenar, dikdörtgen veya ucgen seciniz ; ");
		String sekilIsmi=scan.next().toLowerCase();
		System.out.print("Lutfen kisa kenari giriniz : ");
		int num1=scan.nextInt();
		System.out.print("Lutfen uzun kenari giriniz : ");
		int num2=scan.nextInt();
		
		alanVeCevre(sekilIsmi,num1,num2);
		scan.close();  
	}
		public static void alanVeCevre(String sekilIsmi,int num1,int num2) {
			
			
			switch (sekilIsmi) {
				case "paralelkenar" :
					System.out.println("Alan = " + num1*num2);
					System.out.println("Cevre = "+ 2*(num1+num2));
					break;
				case"dikdortgen" :
					System .out.println("Alan = "+ num1*num2);
					System.out.println("Cevre = "+2*(num1*num2));
					break;
				case "ucgen" :
					System.out.println("Alan ="+ (num1*num2)/2);
					break;
				default :
				System.out.println("Yanlis ismi girdiniz ");
			}
		}
}
