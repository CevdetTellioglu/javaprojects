package day14dowhileloop;

import java.util.Scanner;

public class DoWhileLoopRv04 {

	public static void main(String[] args) {
		// kullanicidan bir String alin 
		// Bu String in index i tek sayi olan 
		// character lerini ekrana yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String str=scan.nextLine();
		
		int length=str.length();
		int i = 0;
		
		do {
			if(i%2==1) {
				System.out.print(str.charAt(i) );
			}i++;
		}while(i<length);
		
		scan.close();
		

	}

}