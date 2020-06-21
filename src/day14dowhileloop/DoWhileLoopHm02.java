package day14dowhileloop;

import java.util.Scanner;

public class DoWhileLoopHm02 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		// biten 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Baslangic ve bitis degerini sirayla giriniz");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		do {
			if(num1%4==0 && num1%6==0) {
				System.out.print(num1+" ");
			}num1++;
		}while(num1<num2);
		scan.close();
	}

}
