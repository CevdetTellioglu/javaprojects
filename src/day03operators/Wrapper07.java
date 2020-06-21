package day03operators;

import java.util.Scanner;

public class Wrapper07 {

	public static void main(String[] args) {
		// double 100.235 i int’e çevirip ekrana yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
		
		double num1 = 100.235;
		int num2 = (int)num1;
		
		System.out.println(num2);
		scan.close();
	}

}
