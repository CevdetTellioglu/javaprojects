package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatementHomeWork01 {

	public static void main(String[] args) {
		// Kullanıcıdan bir tamsayı alın eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.
		//0 ise ekrana “Nötr” yazdırın. 0 dan büyük ise ekrana “Pozitif” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter integer number");
		int num=scan.nextInt();
		
		if (num<0) {
			System.out.println("Negatif");
		}else if(num==0) {
			System.out.println("Notr");
		}else if(num>0) {
			System.out.println("Pozitive");
		}
			
		scan.close();

	}

}
