package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopHm06 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş harflerini alın ve 
		//başlangıç harfinden başlayıp bitiş harfinde biten tüm
		//harfleri büyük harf olarak ekrana yazdırın.
		//Kullanıcının hata yapmadığını farz edin.
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Please insert a character : ");
		char num1=scan.next().toUpperCase().charAt(0);
	
		System.out.print("Please insert second character : ");
		char num2=scan.next().toUpperCase().charAt(0);
		
		if (num1<num2) {
			while(num1<=num2) {
				
				System.out.print(num1+" - ");
				num1++;
			}
		}else {
			while(num1>=num2) {
				
				System.out.print(num1 +"-");
				num1--;
			}
		}
		scan.close();
	

	}

}
