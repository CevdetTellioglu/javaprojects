package Java_Review;

import java.util.Scanner;

public class day02ornek02 {

	public static void main(String[] args) {
		// Kullanıcıdan bir sayı girmesini isteyiniz
		// Sayı tek sayı ise "Sayınız tek sayıdır."
		// Sayı çift sayı ise "Sayınız çift sayıdır." yazdırınız 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter one number");
		int num=scan.nextInt();
		
		if(num%2==0) {
			System.out.println("Citf sayi");
		}else {
			System.out.println("Tek sayidir");
		}
		
		scan.close();

	}

}
