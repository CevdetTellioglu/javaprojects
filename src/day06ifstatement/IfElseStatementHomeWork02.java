package day06ifstatement;

import java.util.Scanner;

public class IfElseStatementHomeWork02 {
	
	public static void main(String[] args) {
		//Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana 
		//“Eşkenar üçgen” yazdırın. Diğer durumlarda ekrana “Eşkenar değil” yazdırın.
			
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the edge length of the Triangle");
		double edge1=scan.nextDouble();
		System.out.println("Please enter the edge length of the Triangle");
		double edge2=scan.nextDouble();
		System.out.println("Please enter the edge length of the Triangle");
		double edge3=scan.nextDouble();
		
		if(edge1== edge2 && edge1 == edge3){
			System.out.println("Equilateral Triangle");
		}else {
			System.out.println("Sorry That's not Equilateral Triangle ");
		}
		scan.close();
		
	}

}
