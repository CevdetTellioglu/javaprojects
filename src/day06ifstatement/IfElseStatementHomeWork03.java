package day06ifstatement;

import java.util.Scanner;

public class IfElseStatementHomeWork03 {

	public static void main(String[] args) {
		// Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. 
		//Eğer urun miktarı 1000 den fazla ise Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın.
		//Diğer durumlarda ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Please pieces of product: ");
		int pieces = scan.nextInt();
		System.out.println("Please price of product: ");
		double price=scan.nextDouble();
		if(pieces>1000) {
			System.out.println("total payment: "+ ((pieces*price)*90/100));
		}else {
			System.out.println("Total payment: "+pieces*price);
		}
		scan.close();
	}

}
