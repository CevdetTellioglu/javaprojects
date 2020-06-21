package day15methodcreation;

import java.util.Scanner;

public class MethodCreationHm02 {

	public static void main(String[] args) {
			//soruları çözerken metodları main methodun
			//dışında oluşturup main methodun icinden çağırınız.
		
		// Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”,
		// birinci sayı büyük ise ekrana “Birinci sayı büyük”, 
		// ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.
		
		int num1=0;
		int num2=0;
		biggerThan(num1,num2);
		
		}
	public static void biggerThan(int num1,int num2) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please insert num1");
			num1=scan.nextInt();
			System.out.println("Please insert num2");
			num2=scan.nextInt();
			if(num1==num2) {
				System.out.println("esit");
			}else if(num1>num2) {
				System.out.println(num1 + " buyuktur "+num2);
			}else {
				System.out.println(num2 + " buyuktur "+num1);
			}
			scan.close();
	}

}
