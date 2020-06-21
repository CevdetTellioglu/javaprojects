package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopHm04 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş değerlerini 
		//alın ve başlangıç değerinden başlayıp bitiş değerinde biten
		//tüm tamsayıların toplamını ekrana yazdırın.
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir baslangic degeri giriniz : ");
		int num1=scan.nextInt();
		System.out.println("Lutfen bir bitis degeri giriniz : ");
		int num2=scan.nextInt();
		int total=0;
		
		while(num1<=num2) {
			total+=num1;
			num1++;	
		}System.out.println("Toplam deger :"+ total);
		scan.close();
		
	}

}
