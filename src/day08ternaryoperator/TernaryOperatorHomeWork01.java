package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorHomeWork01 {

	public static void main(String[] args) {
		 //Kullanıcıdan bir tamsayı girmesini isteyin, tamsayı çift ise ekrana “Çift” tek ise ekrana “Tek”
		//yazdırın.
		
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Bir tamsayi giriniz");
        int num = scan.nextInt();
        
        String result= num%2==0 ? "Cift" : "Tek";
        System.out.println(result);
        scan.close();
        
        
	}
}
