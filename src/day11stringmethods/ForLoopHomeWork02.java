package day11stringmethods;

import java.util.Scanner;

public class ForLoopHomeWork02 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		//ve başlangıç değerinden veya sonrasından başlayıp
		//bitiş değerinde veya öncesinde biten tüm çift tamsayıları ekrana yazdırın.
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen baslangic degerini giriniz : ");
		int num1=scan.nextInt();
		System.out.print("Lutfen bitis degerini giriniz : ");
		int num2=scan.nextInt();
		
		
			
		if(num1<num2) {
			
		if(num1%2==0) {
			for(int i=num1;i<num2;i+=2 ) {
				System.out.println(i+ " ");
				}
			}else if(num1%2==1) {
				for(int i=num1+1;i<=num2;i+=2) {
					System.out.println(i+" ");
				}	
			}
		}else {
			System.out.println("Lutfen baslangic degerine kucuk rakami girin.");
		}
	scan.close();
	}

}
