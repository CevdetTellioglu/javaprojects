package day10Stringmethods;

import java.util.Scanner;

public class StringMethodHomeWork01 {

	public static void main(String[] args) {
		// Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, dördüncü ve sonuncu
		//rakamlarını ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your credit card number ");
		String num=scan.next();
		int length = num.length();
		System.out.println(num.charAt(2));
		System.out.println(num.charAt(3));
		System.out.println(num.charAt(length-1));
		scan.close();
	}

}
