package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopHm03 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından başlayıp 
		// bitiş değerinde veya öncesinde biten tüm çift tamsayıları while loop kullanarak ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir baslangic degeri giriniz : ");
		int num1=scan.nextInt();
		System.out.println("Lutfen bir bitis degeri giriniz : ");
		int num2=scan.nextInt();
		
		while(num1<=num2) {
			if(num1%2==0) {
				System.out.print(num1+" ");
			}num1++;
			}
		scan.close();
	}

}
