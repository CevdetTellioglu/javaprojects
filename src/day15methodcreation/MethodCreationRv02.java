package day15methodcreation;

import java.util.Scanner;

public class MethodCreationRv02 {

	public static void main(String[] args) {
	
			// Saati saniye'ye , mil'i km ye, kg yi gram a 
			// ceviren bir program yaziniz.
			// Bu methodu main methodun disinda olsuturup main methodun
			// icinden cagiriniz
		Scanner scan=new Scanner(System.in);
		System.out.println("Birimi giriniz :");
		String birim = scan.nextLine();
		System.out.println("Degeri giriniz :");
		double miktar =scan.nextDouble();
		
		converter(birim,miktar);
		
		scan.close();
	}
	public static void converter(String birim, double miktar) {
		switch(birim) {
		case "saat":
			System.out.println(miktar*60*60);
			break;
		case "mil":
			System.out.println(miktar*1.6);
			break;
		case "kilogram":
			System.out.println(miktar*1000);
			break;
			default:
				System.out.println("saat, mil ve kilogram disinda bir birim girmeyiniz.");
		}
	}
}
