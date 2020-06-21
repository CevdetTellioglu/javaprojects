package day06review;

import java.util.Scanner;

public class IfStatementRv05 {

	public static void main(String[] args) {
		// kullanicidan bir dikdortgenin en ve boyunu alin 
		// en ve boy esit ise bu bir karedir yazdir
		// en ve boy farkli ise bu bir dikdortgendri yazdir
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1. kenar olcusunu giriniz");
		double num1=scan.nextDouble();
		System.out.println("Lutfen 2.kenar olcusunu giriniz");
		double num2 = scan.nextDouble();
		
		if(num1==num2) {
			System.out.println("bu bir karedir");
		}
		if(num1!=num2) {
			System.out.println("bu bir dikdortgendir");
		}

				// else ==> diger ihtimallerin tamami demek 
				// en ile boy ya esittir ya degildir..
		if(num1==num2) {
			System.out.println("bu bir karedir");
			}else {
				System.out.println("dikdortgendir");
			}
		scan.close();
	}

}
