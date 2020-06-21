package day11stringmethods;

import java.util.Scanner;

public class ForLoopHomeWork06 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden
		//başlayıp bitiş harfinde biten tüm harfleri büyük harf olarak ekrana yazdırın.
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen baslangic degerini giriniz : ");
		char lt=scan.next().toUpperCase().charAt(0);
		System.out.print("Lutfen bitis degerini giriniz : ");
		char lt1=scan.next().toUpperCase().charAt(0);
		
		
		System.out.println(lt+" ve "+lt1+" arasindaki tum harfler :");
		for(char i=lt;i<=lt1;i++) {
			System.out.print( i +" ");
		}
		System.out.println(" ");
		 //2.yol
		
		System.out.println("Baslangic harfini giriniz");
		char ch1 = scan.next().toUpperCase().charAt(0);
		System.out.println("Bitis harfini giriniz");
		char ch2 = scan.next().toUpperCase().charAt(0);
		
		System.out.println(ch1 + " - " + ch2);
		
		if(ch1>ch2) {
			
			System.out.println("Harfleri alfabetik sirayla giriniz");
			
		}else if((ch1<='Z' && ch1>='A') && (ch2<='Z' && ch2>='A')) {
			
			for(char i=ch1; i<=ch2; i++) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("Baslangic ve bitis harf olmalidir");
		}

		
	scan.close();
	}
	

}
