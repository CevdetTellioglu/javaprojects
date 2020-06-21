package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterwiev03 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin bu sayinin tersini ekrana yazdirin.
		// Bur sayiyin tersinin 2 fazlasini ekrana yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		String num=scan.next();
		String ters="";
		
		for(int i=num.length()-1;i>=0;i--) {
			ters= ters+num.charAt(i);
			}
		System.out.println(ters);
		int tersInt= Integer.valueOf(ters);
		tersInt = tersInt +2;
		
		System.out.println(tersInt);
		
		// Hoca'nin yaptigi
		
				// Kullanicidan bir sayi alin
				// Bu sayinin tersinin 2 fazlasini ekrana yazdirin.
				
//		​
//				System.out.println("Bir sayi giriniz");
//				String num1 = scan.nextLine();
//				
//				String ters1 = "";
//				
//				for(int i=num1.length()-1; i>=0; i--) {
//					ters1 = ters1 + num1.charAt(i) + "";//char'i String'e cevirmek icin sonuna + "" ekleyebilirsiniz
//				}
//				
//				System.out.println(ters1);
//				
//				int tersInt1 = Integer.valueOf(ters1);
//				tersInt1 = tersInt1+2;
//				
//				System.out.println(tersInt1);	

		
scan.close();
	}

}
