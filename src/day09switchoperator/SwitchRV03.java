package day09switchoperator;

import java.util.Scanner;

public class SwitchRV03 {

	public static void main(String[] args) {
		 // Kullacidan ay ismini girsin
		// Program kacinci ay oldugunu ekrana yazsin
		// Buyuk kucuk harf hepsi icin calissin
		// Yanlis ay ismi girerse "GEcerli ay ismi girilsin"
		

Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your month");
        String month = scan.next();
        month = month.toLowerCase(); // toLowerCase() ==> bu method Stringleri kucuk harfe cevirmek icin kullanir
        							// toUpperCase() ==> Bu method String'leri buyuk harfe cevirmek icin kullanilir

        switch(month) {
        case "january":
            System.out.println("This month : 1");
            break;
        case "february":
            System.out.println("This month : 2");
            break;
        case "march":
            System.out.println("This month : 3");
            break;
        case "april":
            System.out.println("This month : 4");
            break;
        case "may":
            System.out.println("This month : 5");
            break;
        case "june":
            System.out.println("This month : 6");
            break;
        case "july":
            System.out.println("This month : 7");
            break;
        case "august":
            System.out.println("This month : 8");
            break;
        case "september":
            System.out.println("This month : 9");
            break;
        case "october":
            System.out.println("This month : 10");
            break;
        case "november":
            System.out.println("This month : 11");
            break;
        case "december":
            System.out.println("This month : 12");
            break;
        default:
            System.out.println("Try again");
            }
	scan.close();
		
		}

}
