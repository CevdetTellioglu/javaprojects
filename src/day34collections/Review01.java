package day34collections;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
				// Kullanicidan adini ve soyadini aliniz
				// 1)Ad ve soyadini console’a yazdirin
				// 2)Sadece adini console’a yazdirin
				// 3)Ad ve soyadinin ilk harflerini console’a yazdirin
				// 4)Ad ve soyadini console’a tersten yazdirin
				// 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada 
				//  console’a yazdirin.		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("lutfen adinizi giriniz");
		String ad = sc.nextLine().toLowerCase();
		System.out.println("lutfen soyadinizi giriniz");
		String soyAd = sc.nextLine().toLowerCase();
		
		
		System.out.println(ad+" "+ soyAd );
		System.out.println(ad);
		System.out.println(ad.charAt(0));
		System.out.println(soyAd.charAt(0));
		System.out.println("4.adim");
		  for(int i=ad.length()-1;i>=0;i--) 
	        {
	            System.out.print(ad.charAt(i));
	        }
		  System.out.println(" ");
		  for(int i=soyAd.length()-1;i>=0;i--) 
	        {
	            System.out.print(soyAd.charAt(i));
	        }
		  System.out.println(" ");
		  	// String builder ile ters cevirme
					StringBuilder strB= new StringBuilder(ad+ " "+soyAd);
					System.out.println(strB.reverse());
					
		  System.out.println(" ");
		  System.out.println("5 adim ");
		  
		  String adSoyAd = ad+soyAd;
			String isimSoyisimArr[] = adSoyAd.split("");
			Arrays.sort(isimSoyisimArr); 
			System.out.println(Arrays.toString(isimSoyisimArr));
			
		
		  
			sc.close();
	}

}
