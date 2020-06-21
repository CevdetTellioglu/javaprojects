package day09switchoperator;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
		// 1. 0()dahil ile 50 arasi - D  2. 50(dahil) ile 60 arası - C  3. 60(dahil) ile 80 arası - B 4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana “Gecerli not giriniz” yazdirin
		
		//Switch() de long- double- boolean- float kullanilmaz
		//Switch() de int -byte- short- char- String kullanilir
		//Switch() de case ifadesinden sonra sadece bir deger yazabilirsiniz.
		//Her hangi bir islem yapamazsiniz.
		
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lufen not giriniz");
       int num = scan.nextInt();
       
       if(num>=0 && num<50){
    	   num=0;
       }else if(num>=50 && num<60) {
    	   num = 50;
       }else if(num>=60 && num<80) {
    	   num = 60;
       }else if(num>=80 && num<=100) {
    	   num = 80;
       }
        
        switch(num) {
        case 0:
            System.out.println("D");
            break;
        case 50:
            System.out.println("C");
            break;
        case 60:
            System.out.println("B");
            break;
        case 80 :
            System.out.println("A");
            break;
        default:
            System.out.println("gecerli not giriniz");
            break;
        }
        scan.close();
	}

}
