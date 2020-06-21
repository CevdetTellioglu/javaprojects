package day11stringmethods;

import java.util.Scanner;

public class ForLoopHomework01 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		//biten tüm tamsayıları ekrana yazdırın.
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Lutfen baslangic degerini giriniz : ");
		int num1=scan.nextInt();
		System.out.print("Lutfen bitis degerini giriniz : ");
		int num2=scan.nextInt();
		System.out.println("tum sayilar: ");
		for(int i=num1;i<=num2;i++) {
			System.out.print(i+ " ");
		}
		scan.close();
	}

}
