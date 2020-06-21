package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatementHomeWork04 {

	public static void main(String[] args) {
		//Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum” yazdırın. 
		//Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl” yazdırın.
		//Eğer yıl 10’a bulunuyorsa ekrana “Onyıl” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter year");
		int year=scan.nextInt();
		
		if(year>10 && year<100) {
			System.out.println("On Yil");
		}else if(year>=100 && year<1000) {
			System.out.println("Yuzyil");
		}else if(year>=1000) {
			System.out.println("Milenyum");
		}
scan.close();
	}

}
