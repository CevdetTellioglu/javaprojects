package day11stringmethods;

import java.util.Scanner;

public class ForLoopHomeWork03 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden
		//veya sonrasından başlayıp bitiş değerinde veya öncesinde biten
		//tüm 3 ile bölünebilen tamsayıları ekrana yazdırın.
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen baslangic degerini giriniz : ");
		int num1=scan.nextInt();
		System.out.print("Lutfen bitis degerini giriniz : ");
		int num2=scan.nextInt();
		
		if (num1 % 3 == 1 ) {
			num1 += 2 ;
		} else if (num1 % 3 == 2) {
			num1 += 1;
		}
		
		if (num2 % 3 == 1 ) {
			num2 -= 1;
		} else if (num2 % 3 == 2) {
			num2 -= 2; 
		}
		if(num1<num2) {
		for(int i=num1;i<num2;i+=3) {
				System.out.print(i+" ");
		}
		}else {
			System.out.println("Lutfen ilk degeri ikinci degerden kucuk giriniz");
		}
		
		System.out.println(" ");
		// 2.yol
		
		System.out.print("Lütfen baslangic degerinizi giriniz: ");
		int start = scan.nextInt();
		
		System.out.print("Lütfen bitis degerinizi giriniz: ");
		int end = scan.nextInt();
		
		int tribleStart = start%3==0 ? start : (start+1)%3 == 0 ? start+1 : start+2;
		
		for (int i = tribleStart ; i>= tribleStart && i<=end;i+=3) {
			
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		
		// 3.yol 
		
		System.out.println("Baslangic degerini giriniz");
		int numa= scan.nextInt();
		System.out.println("Bitis degerini giriniz");
		int numb = scan.nextInt();
		
		if(numa>numb){
			System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
		}else {
			
			for(int i=numa; i<=numb; i=i+1) {
				if(i%3==0) {
					System.out.print(i+" ");
				}
			}
			
		}

		
		
scan.close();
	}

}
