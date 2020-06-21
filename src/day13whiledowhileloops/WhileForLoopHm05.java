package day13whiledowhileloops;

import java.util.Scanner;

public class WhileForLoopHm05 {
	
	public static void main(String[]args) {
		//Kullanıcıdan bir String alın ve bu String’in 
		//ilk harfi ile son harfinin yerlerini değiştirerek ekrana yazdırın.
		//Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız.
		
		 Scanner scan = new Scanner(System.in);
	        
	     System.out.println("Isminizi giriniz");
	     String isim = scan.nextLine();
	     
	     char ilk = isim.charAt(0);
	     char son = isim.charAt(isim.length()-1);
	     
	     System.out.println(son+isim.substring(1,isim.length()-1)+ilk);
	     
		scan.close();
	}

}
