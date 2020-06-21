package day15methodcreation;

import java.util.Scanner;

public class MethodCreationHm03 {

	public static void main(String[] args) {
		//soruları çözerken metodları main methodun
		//dışında oluşturup main methodun icinden çağırınız.
		
		//Kullanıcıya sayı girmesini söyleyin. 
		//Kullanıcının girdiği sayının rakamları toplamını ekrana 
		//yazdıran bir program yazın.
		
		int num1=0;
		int sum=0;
		int sayi=0;
		toplam(num1,sum,sayi);
		
		
	}
	public static void toplam(int num1, int sum,int sayi) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz ");
		num1=scan.nextInt();
		 while(num1 != 0)
	        {
	           sum=(num1%10)+sum;
	           num1 /= 10;
	            ++sayi;
	        }
	 
	        System.out.println(sum);
	        scan.close();
	}
}
