package day13whiledowhileloops;

import java.util.Scanner;

public class WhileForLoopHm03 {

	public static void main(String[] args) {
		// Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız. 
		// Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please insert start number :");
		int num1=scan.nextInt();
		
		for(int i=1; i <=num1; i++) {
			if(num1%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
		int i=1;
		
		while(i<=num1) {
			if(num1%i==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		scan.close();
	}
	}


