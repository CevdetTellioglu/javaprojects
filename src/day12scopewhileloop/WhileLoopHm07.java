package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopHm07 {

	public static void main(String[] args) {
		//  Kullanıcıdan bir rakam alın ve bu rakam
		// icin çarpım tablosunu ekrana yazdırın. Kullanıcının hata 
		// yapmadığını farz edin.
		// Ornegin kullanıcı 3 girerse;
        // 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 
		// 3x7=21 3x8=24 3x9=27 3x10=30
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please insert a number : ");
		int num=scan.nextInt();
		int product=1;
		for(int i=product;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+num*i);
			}
		System.out.println(" ");
		
		//2.yol 
		
		while(product<=10) {
			System.out.println(num+" * "+ product + " ="+ (num*product)+ "    ");
			product++;
		}
		
		System.out.println(" ");
		//Hocanin yaptigi yol 
		
		for(int i=1; i<11; i++) {
			System.out.println("3x" + i + "=" + (3*i));
		}
		System.out.println(" ");
		
		//Hocanin while dongusu yapimi 
		
		int num1=1;
		while(num1<11) {
			System.out.println("3x" + num1 + "=" + (3*num1));
			num1++;
		}
		scan.close();
		
		
	}

}
