package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		//* Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde, 
		//* ekrana o ana kadar girmiş olduğu 
		//* tüm sayıların toplamını yazdırınız.
		//* Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
		

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		do {
		
		System.out.println("Sayi giriniz");
			num = scan.nextInt();
			sum = sum + num;
			
		}while(num!=0);
		
		System.out.println(sum);
		
		for(int i=1; i<=5 ; i++){
	        
			for(int j=1; j<=i; j++){
	        System.out.print("* ");
	        }
	        System.out.println("");
		}
		
		for (int i = 1; i <=4; i++) {
			for(int j=4; j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println("");	
		}
		scan.close();
	}

}
