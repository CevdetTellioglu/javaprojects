package day13whiledowhileloops;

import java.util.Scanner;

public class WhileForLoopHm02 {
	public static void main(String[] args) {
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		// biten 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please insert start number :");
		int num1=scan.nextInt();
		System.out.print("Please insert finally number :");
		int num2=scan.nextInt();
		
		if(num1<num2) {
			for(int i=num1; i<=num2 ; i++) {
				if(i%3==0 && i%5==0) {
					System.out.print(i+" ");
					}
				}
		}else if(num1>num2) {
			for(int i=num1; i>=num2;i--) {
				if(i%3==0 && i%5==0) {
					System.out.print(i+" ");
				}
				
			}
		}
		System.out.println(" ");
		
		while(num1<=num2) {
			if(num1%3==0 && num1%5==0) {
				System.out.print(num1+" ");
			}num1++;
		}
		
		
		scan.close();
		
	}

}
