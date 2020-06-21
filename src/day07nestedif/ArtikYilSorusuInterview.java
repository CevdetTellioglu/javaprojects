package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// kullanicidan yil girmesini isteyin 
		// girilen yil artik yil ise "Artik Yil" yazdirin
		//Girilen yil artik yil degil ise ekrana "Artik yil degil" yazdirin 
		
		// Artik yil 1) Yil eger 100 e bolunurse 400 e de bolunmeli ==> 1300 artik yil degil cunku 100 e bolundugu halde 400 e bolunmuyor
		//																1200 artik yildir cunku  100 e bolunuyor ve 400 e de bolunuyor.
		//			 2) yil eger 100 e bolunmezse 4 e bolunmeli
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input year :  ");
		int year =scan.nextInt();
		
		if(year%100==0 && year%400==0) {
			System.out.println(year + " Artik yildir.");
		}else if(year%100!=0 &&year%4 ==0) {
			System.out.println(year + " Artik yildir.");
		}else {
			System.out.println(year +" Artik yil degildir.");
		}
		
		
		 
		    scan.close();
		    }
			
	}


