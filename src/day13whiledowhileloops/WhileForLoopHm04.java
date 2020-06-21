package day13whiledowhileloops;

import java.util.Scanner;

public class WhileForLoopHm04 {

	public static void main(String[] args) {
		// Kullanıcıdan uzunluğu çift sayı olan bir String alın ve bu String’in ilk yarısını ekrana yazdırın.
		// Ornegin; Kullanıcı “Hollanda” girerse ekrana “Holl” yazdıracaksınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert a word ");
		String st=scan.nextLine();
		int a1=st.length();
		
		System.out.println(st.substring(0,a1/2));
	
		scan.close();
		}
		
		
		

	}


