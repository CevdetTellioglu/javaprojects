package day19arrays;

import java.util.Scanner;

public class ArraysRv03 {

	public static void main(String[] args) {
		// Elemanlari 1, 2, 3, 4, 5 olan bir integer array olusturunuz
				// Bu array’de 3 elemaninin olup olmadigini kontrol ediniz. 
			    // 3 varsa ekrana “3 var yazdirin”, 3 yoksa ekrana “3 yok yazdirin”
				// kac tane 3 oldugunu da yazdirin 
		
				Scanner scan = new Scanner(System.in);
		
		int arr1[]=new int[5];
		int count =0;
		System.out.println("lutfen 5 tane sayi girin ");
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=scan.nextInt(); // Array kullanicidan eleman alma 
			
			if(arr1[i]==3) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(count+" adet var");
		}else {
			System.out.println("Maalesef yok");
		}
		scan.close();
	}

}
