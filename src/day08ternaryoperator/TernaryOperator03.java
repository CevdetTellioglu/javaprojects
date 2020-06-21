package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		//Kullanicidan 2 sayi aliniz
		// kucuk sayiyi ekrana yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter first number");
		double num=scan.nextDouble();
		System.out.println("please enter second number");
		double num2=scan.nextDouble();
		
		double result= (num<=num2)?num:num2;
		System.out.println(result); //result sonuc demek
		scan.close();
	}

}
