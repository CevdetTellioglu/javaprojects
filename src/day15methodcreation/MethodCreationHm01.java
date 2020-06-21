package day15methodcreation;

import java.util.Scanner;

public class MethodCreationHm01 {

	public static void main(String[] args) {
		
		//soruları çözerken metodları main methodun
		//dışında oluşturup main methodun icinden çağırınız.

		//Kullanıcıdan isim ve soyismini alın.
		//Kullanıcının isim ve soyisminin ilk harflerini büyük 
		//diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
		String name = "" ;
		String surname= "";
		
		
		isim(name,surname);
		
		
	}
	public static void isim(String name,String surname ) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert your name.");
		 name = scan.nextLine();
		System.out.println("Please insert your surname ");
		 surname=scan.nextLine();
		 
		name= Character.toString(name.charAt(0)).toUpperCase()+name.substring(1);
		System.out.println(name);
		surname= Character.toString(surname.charAt(0)).toUpperCase()+surname.substring(1);
		System.out.println(surname); 
		 
		 
		 scan.close();
		
	}
}
