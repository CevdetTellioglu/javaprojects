package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopHm05 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve
		// başlangıç değerinden başlayıp bitiş değerinde biten 
		// tüm tamsayıların çarpımını ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a start value : ");
		int num1=scan.nextInt();
		System.out.println("Please enter a finish value : ");
		int num2=scan.nextInt();
		int product=1;
		
		while(num1<=num2) {
			product*=num1;
			num1++;	
		}System.out.println("Toplam deger :"+ product);
		scan.close();
		
		
		
		
	}

}
