package day21multidimensionalarray;

import java.util.Scanner;

public class SplitMethodSorurv {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen cumlenizi giriniz ");
		String str=scan.nextLine();
		str = str.replace(" ", ""); // replace methodu ile bosluklari sildik 
		String harf[]=str.split("");
		
		System.out.println("Harf Sayisi: "+ harf.length);
		
		
		System.out.println("2.yol");
		
		// Her zaman kelime sayisi bosluk sayisindan 1 azdir.
		// bosluk sayisi = kelime sayisi - 1
		
		
		System.out.println("Lutfen cumlenizi giriniz ");
		String st=scan.nextLine();
		String word[]=st.split(" ");
		st = st.replace(" ", ""); // replace methodu ile bosluklari sildik 
		int space = word.length-1;
		System.out.println(space+" bosluk sayisi ");
		
		String character[]=st.split("");
		System.out.println(character.length + " karakter sayisi bosluk dahil");
		System.out.println(character.length - space +" karakter sayisi bosluklar haric");
	scan.close();	
	}

}
