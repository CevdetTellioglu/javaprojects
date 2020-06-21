package day03operators;

import java.util.Scanner;

public class Wrapper09 {

	public static void main(String[] args) {
		//int data type’ında oluşturulan 5 sayısı ile double data type’ında 
		//oluşturulan 6.2 sayısını toplayıp sonucu ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
			
		int num1 = 5;
		double num2 = 6.2;
		double num3 = (double)num1;
		
		System.out.println(num2+num3);
	scan.close();
	}

}
