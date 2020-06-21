package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// / Kullanicidan iki sayi alin
		// Bu sayilar birbirine esit ise toplamlarini ekrana yazdirin
		// Bu sayilar birbirinden farkli ise carpimlarini ekrana yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter one number");
		double num=scan.nextDouble();
		System.out.println("please enter second number");
		double num2=scan.nextDouble();
		
		double toplamesit= (num==num2)?num+num2:num*num2;
		System.out.println(toplamesit);
		
		scan.close();
	}

}
