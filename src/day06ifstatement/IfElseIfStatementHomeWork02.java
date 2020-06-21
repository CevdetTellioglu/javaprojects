package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatementHomeWork02 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın
		eğer üç kenar uzunluğu birbirine eşit ise ekrana “Eşkenar üçgen” yazdırın.
		Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen” yazdırın.
		Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the edge length of the Triangle");
		double edge1=scan.nextDouble();
		System.out.println("Please enter the edge length of the Triangle");
		double edge2=scan.nextDouble();
		System.out.println("Please enter the edge length of the Triangle");
		double edge3=scan.nextDouble();
		
		if (edge1==edge2 && edge1==edge3) {
			System.out.println("Equilateral Triangle");
		}else if(edge1==edge2 || edge1==edge3 || edge2==edge3) {
			System.out.println("Isosceles triangle");
		}else if(edge1!=edge2 && edge1!=edge3 && edge2!=edge3) {
			System.out.println("Variational triangle");
		}
		scan.close();
	}
	

}
