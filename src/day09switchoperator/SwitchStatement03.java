package day09switchoperator;

import java.util.Scanner;

public class SwitchStatement03 {

	public static void main(String[] args) {
		// Kullanıcıdan bir tamsayı alın eğer tamsayı 9 ise ekrana “Bir basamaklı en büyük sayı” yazdırın. 
		//99 ise ekrana “İki basamaklı en büyük sayı” yazdırın.
		//999 ise ekrana “Üç basamaklı en büyük sayı” yazdırın.
		//Bu sayıların dışındaki sayılar için “Yorum yok” yazdırın.
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter one number");
		int num1=num.nextInt();
		switch(num1) {
		case 9:
			System.out.println("The largest number in one digit.");
			break;
		case 99:
			System.out.println("Two-digit maximum number");
			break;
		case 999:
			System.out.println("Three-digit maximum number");
			break;
			default:
				System.out.println("No comment");		
		}
		num.close();
	}

}
