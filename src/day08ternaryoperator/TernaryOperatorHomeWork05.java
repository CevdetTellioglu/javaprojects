package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorHomeWork05 {

	public static void main(String[] args) {
		// Kullanıcıdan bir tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
		//3 basamaklı degilse çift olup olmadigini kontrol edin. 
		//Çift ise “3 basamaklı olmayan çift sayı” yazdırın. Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int num = scan.nextInt();
        String result= num>=100 && num<=999 ? "3 basamakli":
        	(num%2==0?"3 basamakli olmayan cift sayi":"3 basamakli olmayan tek sayi");
        System.out.println(result);
        scan.close();

	}

}
