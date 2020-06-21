package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorHomeWork06 {

	public static void main(String[] args) {
		// Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana 
		//“Artık yıl” degilse ekrana “Artık yıl degil” yazdırın.
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir  yil giriniz");
        int num = scan.nextInt();
        String result = ((num%100==0 && num%400==0) || (num%100!=0 && num%4==0))?
        		"Artik yil":"Artik yil degil";
        System.out.println(result);
        scan.close();
	}

}
