package day16overloading;

import java.util.Scanner;

public class HomeWorkQuestion01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya sayı girmesini söyleyin. 
		 Kullanıcının girdiği sayının rakamları toplamını ekrana 
       yazdıran bir program yazın.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert a number");
		int num = scan.nextInt();
		
		figureTotal(num);
		scan.close();
	}
	 public static void figureTotal(int num) {
		 int sum=0;
		 
		 while(num!=0) {
			 sum = sum +num%10;
			 num = num/10;
			 }
		 System.out.println("Figure Total : "+ sum);
	 }

}
