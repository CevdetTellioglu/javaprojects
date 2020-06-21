package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorHomeWork04 {

	public static void main(String[] args) {
		// Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin. En ve boy eşit ise ekrana “Kare”
		// farklı ise ekrana “Dikdörtgen” yazdırın.
		Scanner scan = new Scanner(System.in);
      	System.out.println("cismin enini giriniz");
        int num = scan.nextInt();
        System.out.println("cismin boyunu giriniz");
        int num2= scan.nextInt();
        
        String result = num==num2?"Karedir" :"Dikdortgendir";
        System.out.println(result);
        scan.close();

	}

}
