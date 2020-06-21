package day20arrays;

import java.util.Arrays;
import java.util.Scanner;


public class ArraysHomeWork01 {

	public static void main(String[] args) {
		
		//Soru:
		//	Kullanıcıya kaç elemanlı bir array gireceğini sorun. Kullanıcıdan array’in elemanlarını girmesini isteyin.
		//	a) Bu array’in tum elemanlarını ekrana yazdırın.
		//	b) Bu arayın son elemanını ilk eleman yapın ve tum elemanlarını ekrana yazdırın.
		//	Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdırın.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac elemanli bir integer array olusturmak istersiniz");
		int length =scan.nextInt();
		
		int arr[]=new int[length];
		System.out.println("Bu arrayin elemanlarini girin");
		for (int i = 0; i < length; i++) {
			arr[i]=scan.nextInt();
			}
	
		System.out.println(Arrays.toString(arr));
		
		int arrSon[]=new int[length];
		
		for (int i = 1; i < length; i++) {
			arrSon[i-1] = arr[i];	
		}
		arrSon[length-1]=arr[0];
		System.out.println(Arrays.toString(arrSon));
		scan.close();
	}

}
