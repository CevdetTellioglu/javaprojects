package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopHm02 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		// biten tüm tamsayıları while loop kullanarak ekrana yazdırınız.

		Scanner scan = new Scanner(System.in);
			System.out.print("Lutfen bir baslangic degeri giriniz : ");
			int num1=scan.nextInt();
			System.out.println("Lutfen bir bitis degeri giriniz : ");
			int num2=scan.nextInt();
				
			
			while(num1<=num2) {
				System.out.print(num1+" ");
				num1++;
				}
			scan.close();	
	}

}
