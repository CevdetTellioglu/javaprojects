package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorHomeWork02 {

	public static void main(String[] args) {
		//  Kullanıcıdan iki tamsayı girmesini isteyin, ekrana her zaman büyük olanını yazdırın
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Birinci tamsayiyi giriniz");
        int num = scan.nextInt();
        System.out.println("Ikinci tamsayiyi giriniz");
        int num2= scan.nextInt();
        
        int result = num<num2? num2:num;
        System.out.println(result);
        scan.close();

	}

}
