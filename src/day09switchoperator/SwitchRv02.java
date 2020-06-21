package day09switchoperator;

import java.util.Scanner;

public class SwitchRv02 {

	public static void main(String[] args) {
		// KUllanici haftanin gun numarasini girsin 
		// Programiniz gunun ismini girsin
		Scanner scan = new Scanner(System.in);   
        System.out.println("Gun numarasi giriniz");
        int num = scan.nextInt(); 
        switch(num) {
        case 1:
        	System.out.println("Lundi");
        	break;
        case 2:
        	System.out.println("Mardi");
        	break;
        case 3:
        	System.out.println("Mercredi");
        	break;
        case 4:
        	System.out.println("Jeudi");
        	break;
        case 5:
        	System.out.println("Vendredi");
        	break;
        case 6:
        	System.out.println("Samedi");
        	break;
        case 7:
        	System.out.println("Dimache");
        	break;
         }
 scan.close();

	}

}
