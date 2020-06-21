package day02wrapperclasses;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		/*
		 *  Boyutları kullanıcıdan alınan bir dikdörtgenler prizmasının hacmini hesaplayan bir program yazınız.
			Not: Dikdörtgenler Prizmasının Hacmi: En x Boy x Yükseklik
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("dikdortgen icin en boy ve yukseklik giriniz");
		
		int enDikdortgen = scan.nextInt();
		int boyDikdortgen = scan.nextInt();
		int	hDikdortgen = scan.nextInt();
		
		System.out.println("Dikdortenin alani = "+ enDikdortgen * boyDikdortgen * hDikdortgen);
	scan.close();
	}

}
