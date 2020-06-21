package day06review;

import java.util.Scanner;

public class IfElseIfStatementRv03 {

	public static void main(String[] args) {
		// Kullanicidan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir.
		//Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50  bir
		// jackpot oyunu icin program yaziniz
		// 000000 - 000001 -000002 - ..... - 999998-999999-100000

		Scanner scan = new Scanner(System.in);
		System.out.println("Isteyene atarim beyler");
		int num=scan.nextInt();
		
		if(num<200000) {
			System.out.println("zarlar duses beyler, alisverisler");
			}else if(num<600000) {
				System.out.println("zar bos beyler elleri gorelim");
			}else {
				System.out.println("Bizi mi kopariyorsunuz");
			}
		scan.close();
	}

}
