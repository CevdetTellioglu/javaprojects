package day21multidimensionalarray;


import java.util.Scanner;

public class SplitMethodSoru {

	public static void main(String[] args) {
		
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen cumlenizi giriniz");
		String str=scan.nextLine();
		str = str.replace(" ", "");// replace methodu ile bosluklari sildik 
		String harf[]=str.split("");		
				
		System.out.println("harf sayisi: "+ harf.length);

		
		System.out.println("2.yol");
		
		// Her zaman kelime sayisi bosluk sayisindan 1 azdir.
		// bosluk sayisi = kelime sayisi - 1
		
	
		System.out.println("Lutfen  yeni cumlenizi giriniz");
		String str1=scan.nextLine();
		String word[]=str1.split(" ");
		int boslukSayisi = word.length-1;	
		System.out.println(boslukSayisi+ " bosluk sayisi");
		
		String character[]=str1.split("");
		System.out.println(character.length +" karakter sayisi bosluk dahil ");
		System.out.println(character.length - boslukSayisi+" bosluklar haric karakter sayisi");
		scan.close();
		
	}

}
