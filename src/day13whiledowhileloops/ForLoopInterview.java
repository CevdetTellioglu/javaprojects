package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview {

	public static void main(String[] args) {
		// Kullanicidan bir String alin ve bu String'i ekrana tersten yazdirin .
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cumle veya kelime giriniz");
		String str=scan.nextLine();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			}
		
		//2.While ile yapmak icin 
		System.out.println(" ");
		
		int length = str.length()-1;
		while(length>=0) {
			System.out.print(str.charAt(length));
			length--;
		}
		
		scan.close();

	}

}
