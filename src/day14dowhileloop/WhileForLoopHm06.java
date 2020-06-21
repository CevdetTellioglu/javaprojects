package day14dowhileloop;

import java.util.Scanner;

public class WhileForLoopHm06 {

	public static void main(String[] args) {
		// Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün indexini ekrana yazdırın.
		//“a” harfi yoksa ekrana “a harfi yok” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir kelime veya cumle giriniz : ");
		String str=scan.nextLine();
		String st1="a";
		
		//int str1=str.indexOf("a");
		if(str.contains(st1)) {
			System.out.println("a harfinin ilk gorunumu index'i "+str.indexOf("a"));
		}else {
			System.out.println("a harfi yok ");
		}
		scan.close();
		
		

	}

}
