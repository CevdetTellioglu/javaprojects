package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorHomeWork03 {

	public static void main(String[] args) {
		// Kullanıcıdan bir tamsayı girmesini isteyin, ekrana o tamsayının mutlak degerini yazdırın.
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int num = scan.nextInt();
        int result=num<0?num*-1:num;
        System.out.println(result);
        scan.close();

	}

}
