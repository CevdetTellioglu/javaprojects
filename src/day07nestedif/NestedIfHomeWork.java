package day07nestedif;

import java.util.Scanner;

public class NestedIfHomeWork {

	public static void main(String[] args) {
		// Kullanıcıdan cinsiyetini girmesini isteyin.
		//Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		//Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		//Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın. 
		//Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your sex : ");
		String sex =scan.next();
		if (sex.equalsIgnoreCase("man")) {
			System.out.println("Enter your age");
			int age=scan.nextInt();
			if(age<18 && age>=0) {
				System.out.println("Boy");
			}else {
				System.out.println("Man");
			}
			
		}if (sex.equalsIgnoreCase("Women")) {
			System.out.print("Please enter your age");
			int age=scan.nextInt();
			if (age<18 && age>=0) {
				System.out.println("Girl ");
			}else {
				System.out.println("Women ");
			}
		}
			
		
		scan.close();
	}

}
